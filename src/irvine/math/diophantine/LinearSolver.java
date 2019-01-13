package irvine.math.diophantine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Solve Diophantine equations of the form <code>a_1x_1+a_2x_2+...+a_nx_n+b=0</code>.
 *
 * @author Sean A. Irvine
 */
public class LinearSolver implements Diophantine {

  final Z mB;
  final Z[] mA;

  /**
   * Construct a new solver for an equation of the form <code>a_1x_1+a_2x_2+...+a_nx_n+b=0</code>.
   * Where possible nontrivial solutions are found.
   *
   * @param b constant coefficient
   * @param a coefficients
   * @exception NullPointerException if any parameter is null
   * @exception IllegalArgumentException if any <code>a</code> coefficient is zero
   * or the number of coefficients is 0.
   */
  public LinearSolver(final Z b, final Z... a) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    if (a.length == 0) {
      throw new IllegalArgumentException();
    }
    for (final Z v : a) {
      if (v == null) {
        throw new NullPointerException();
      } else if (Z.ZERO.equals(v)) {
        throw new IllegalArgumentException();
      }
    }
    mA = new Z[a.length];
    System.arraycopy(a, 0, mA, 0, a.length);
    mB = b;
  }

  private Z gcd() {
    Z g = mA[0];
    for (int k = 1; k < mA.length; ++k) {
      g = g.gcd(mA[k]);
    }
    return g;
  }

  @Override
  public Iterator<List<Z>> iterator() {
    if (mA.length == 1) {
      return new OneVariableSolver(mA[0], mB, 1).iterator();
    }
    final Z d = gcd();
    if (!mB.mod(d).equals(Z.ZERO)) {
      return StaticIterators.NO_SOLUTION;
    }
    final Z[] t = mA[0].extendedGcd(mA[1]);
    final Z h = mB.negate().divide(t[0]);
    final Z[] full = new Z[mA.length];
    full[0] = t[1].multiply(h);
    full[1] = t[2].multiply(h);
    for (int k = 2; k < full.length; ++k) {
      final Z m = mA[k].add(1);
      for (int j = 0; j < k; ++j) {
        full[j] = full[j].multiply(m);
      }
      full[k] = mB;
    }
    Z p = Z.ONE;
    for (final Z a : mA) {
      p = p.multiply(a);
    }
    final Z product = p.divide(d);
    return new AbstractIterator<List<Z>>() {
      private long mK = 0;
      @Override
      public boolean hasNext() {
        return true;
      }
      @Override
      public List<Z> next() {
        boolean sawZero;
        final ArrayList<Z> res = new ArrayList<>();
        // Make sure none of the variavles are set to zero.
        do {
          sawZero = false;
          res.clear();
          for (int j = 0; j < full.length - 1 && !sawZero; ++j) {
            final Z z = full[j].add(product.divide(mA[j]).multiply(mK));
            sawZero = Z.ZERO.equals(z);
            res.add(z);
          }
          res.add(full[full.length - 1].subtract(product.divide(mA[full.length - 1]).multiply(mK * (full.length - 1))));
          ++mK;
        } while (sawZero);
        return res;
      }
    };
  }

  @Override
  public List<Z> coefficients() {
    final ArrayList<Z> c = new ArrayList<>();
    Collections.addAll(c, mA);
    c.add(mB);
    return c;
  }

  @Override
  public List<Z> powers() {
    final ArrayList<Z> c = new ArrayList<>();
    for (int k = 0; k < mA.length; ++k) {
      c.add(Z.ONE);
    }
    return c;
  }

  @Override
  public String toString() {
    final StringBuilder s = new StringBuilder();
    for (int k = 0; k < mA.length; ++k) {
      final Z a = mA[k];
      if (a.signum() < 0) {
        s.append('-');
      } else if (k != 0) {
        s.append('+');
      }
      final Z abs = a.abs();
      if (!Z.ONE.equals(abs)) {
        s.append(abs);
      }
      s.append("x_");
      if (k < 9) {
        s.append(k + 1);
      } else {
        s.append('{').append(k + 1).append('}');
      }
    }
    if (!Z.ZERO.equals(mB)) {
      if (mB.signum() > 0) {
        s.append('+');
      }
      s.append(mB);
    }
    s.append("=0");
    return s.toString();
  }

  /**
   * Run the linear solver on the specified equation.
   *
   * @param args the coefficients
   */
  public static void main(final String[] args) {
    final Z[] coeffs = new Z[args.length - 1];
    for (int k = 0; k < coeffs.length; ++k) {
      coeffs[k] = new Z(args[k]);
    }
    final LinearSolver s = new LinearSolver(new Z(args[args.length - 1]), coeffs);
    final Iterator<List<Z>> it = s.iterator();
    for (int k = 0; k < 10 && it.hasNext(); ++k) {
      final List<Z> l = it.next();
      for (final Z z : l) {
        System.out.print(z + " ");
      }
      System.out.println();
    }
  }
}

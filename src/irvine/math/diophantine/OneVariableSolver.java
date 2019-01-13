package irvine.math.diophantine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Solve Diophantine equations of the form <code>ax^n+b=0</code>.
 *
 * @author Sean A. Irvine
 */
public class OneVariableSolver implements Diophantine {

  final Z mA, mB;
  final int mN;

  /**
   * Construct a new solver for the equation <code>ax^n+b=0</code>.
   *
   * @param a coefficient
   * @param b coefficient
   * @param n power
   * @exception NullPointerException if any parameter is null
   */
  public OneVariableSolver(final Z a, final Z b, final int n) {
    if (a == null || b == null) {
      throw new NullPointerException();
    }
    mA = a;
    mB = b;
    mN = n;
  }

  private static Iterator<List<Z>> allPositiveIntegers() {
    return new AbstractIterator<List<Z>>() {
      Z mX = Z.ZERO;
      @Override
      public boolean hasNext() {
        return true;
      }
      @Override
      public List<Z> next() {
        mX = mX.add(Z.ONE);
        return buildList(mX);
      }
    };
  }

  private static <T> List<T> buildList(final T v) {
    final ArrayList<T> list = new ArrayList<>();
    list.add(v);
    return list;
  }

  private static <T> List<T> buildList(final T v1, final T v2) {
    final ArrayList<T> list = new ArrayList<>();
    list.add(v1);
    list.add(v2);
    return list;
  }

  private static Iterator<List<Z>> listIterator(final List<List<Z>> list) {
    return new AbstractIterator<List<Z>>() {
      int mPosition = 0;
      @Override
      public boolean hasNext() {
        return mPosition < list.size();
      }
      @Override
      public List<Z> next() {
        if (mPosition >= list.size()) {
          throw new NoSuchElementException();
        }
        return list.get(mPosition++);
      }
    };
  }

  private static Iterator<List<Z>> solve(final Z a, final Z b, final int n) {
    assert n > 0;
    if (a.equals(Z.ZERO)) {
      // 0x^n+b=0. Has infinite solutions for b=0 and none otherwise
      return b.equals(Z.ZERO) ? allPositiveIntegers() : StaticIterators.NO_SOLUTION;
    }
    // Check if b/a is an integer
    final Z[] cc = b.divideAndRemainder(a);
    if (cc[1].equals(Z.ZERO)) {
      // Convert to form x^n=c where c = -b/a
      final Z c = cc[0].negate();
      if (c.signum() < 0 && (n & 1) == 0) {
        // even root of negative number
        return StaticIterators.NO_SOLUTION;
      }
      final Z root = c.root(n);
      // Check if root is perfect
      if (c.auxiliary() != 1) {
        return StaticIterators.NO_SOLUTION;
      }
      final List<Z> rootl = buildList(root);
      if (root.equals(Z.ZERO) || (n & 1) != 0) {
        return listIterator(buildList(rootl));
      } else {
        return listIterator(buildList(rootl, buildList(root.negate())));
      }
    } else {
      return StaticIterators.NO_SOLUTION;
    }
  }

  @Override
  public Iterator<List<Z>> iterator() {
    if (mN == 0) {
      // i.e. x^0 == 1, hence require a == -b for solution
      return mA.equals(mB.negate()) ? allPositiveIntegers() : StaticIterators.NO_SOLUTION;
    }
    if (mN < 0 && !mA.equals(Z.ZERO)) {
      // If n < 0, let m=-n, then we have a/x^m+b=0, which we can rewrite
      // as bx^m+a=0, provided x is nonzero.
      return solve(mB, mA, -mN);
    } else {
      return solve(mA, mB, mN);
    }
  }

  @Override
  public List<Z> coefficients() {
    return buildList(mA, mB);
  }

  @Override
  public List<Z> powers() {
    return buildList(Z.valueOf(mN));
  }

  @Override
  public String toString() {
    final StringBuilder s = new StringBuilder();
    if (mA.equals(Z.NEG_ONE)) {
      s.append('-');
    } else if (!mA.equals(Z.ONE)) {
      s.append(mA);
    }
    s.append('x');
    if (mN != 1) {
      s.append("^{").append(mN).append('}');
    }
    if (!mB.equals(Z.ZERO)) {
      s.append(mB.signum() < 0 ? '-' : '+').append(mB.abs());
    }
    s.append("=0");
    return s.toString();
  }
}

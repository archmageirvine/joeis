package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Irreducible polynomials over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public final class IrreduciblePolynomials {

  private IrreduciblePolynomials() { }

  /**
   * Number of irreducible polynomials of given degree.
   * @param n degree
   * @return number of irreducible polynomials
   */
  public static Z count(final int n) {
    if (n <= 0) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      final int m = Functions.MOBIUS.i(n / d);
      if (m == 1) {
        s = s.add(Z.ONE.shiftLeft(d));
      } else if (m == -1) {
        s = s.subtract(Z.ONE.shiftLeft(d));
      }
    }
    return s.divide(n);
  }

  /**
   * Number of irreducible polynomials of at most the specified degree;
   * but excluding the polynomial <code>x</code>.
   *
   * @param n degree
   * @return number of irreducible polynomials
   */
  public static Z cumulativeCount(final int n) {
    Z s = Z.NEG_ONE;
    for (int k = 1; k <= n; ++k) {
      s = s.add(count(k));
    }
    return s;
  }

  /**
   * Return an iterator producing irreducible polynomials over <code>GF(2)</code>
   * in degree order.
   *
   * @return polynomial iterator
   */
  public static Iterator<Polynomial<Z>> iterator() {
    return new IrreducibleIterator();
  }

  /**
   * Convert the polynomial into a single long
   * @param v polynomial
   * @return long representation
   */
  public static long makeLong(final Polynomial<Z> v) {
    long q = 0;
    for (int k = v.degree(); k >= 0; --k) {
      q <<= 1;
      q += v.coeff(k).intValue();
    }
    return q;
  }

  private static Z makeZ(final Polynomial<Z> v) {
    Z q = Z.ZERO;
    for (int k = v.degree(); k >= 0; --k) {
      q = q.multiply2().add(v.coeff(k));
    }
    return q;
  }

  private static int degree(final Z v) {
    return v.bitLength() - 1;
  }

  private static boolean exactlyDivides(Z ni, final Z di, final int dd) {
    int shift = degree(ni) - dd;
    if (shift < 0) {
      return false;
    }
    while (true) {
      final Z rem = ni.xor(di.shiftLeft(shift));
      //System.out.println("x  -> " + di.toString(2) + " | " + ni.toString(2) + " = " + rem.toString(2) + " shift was=" + shift + " lni=" + degree(ni));
      if (rem.isZero() || rem.equals(di)) {
        return true;
      }
      if (di.compareTo(rem) > 0) {
        return false;
      }
      ni = rem;
      shift = degree(ni) - dd;
    }
  }

  private static int degree(final long v) {
    return (int) LongUtils.log2(v);
  }

  private static boolean exactlyDivides(long ni, final long di, final int dd) {
    int shift = degree(ni) - dd;
    if (shift < 0) {
      return false;
    }
    //System.out.println(d.toString() + " | " + n.toString() + "  -> " + Integer.toBinaryString(di) + " | " + Integer.toBinaryString(ni));
    while (true) {
      final long rem = ni ^ (di << shift);
      //System.out.println("  -> " + Long.toBinaryString(di) + " | " + Long.toBinaryString(ni) + " = " + Long.toBinaryString(rem) + " shift was=" + shift + " lni=" + degree(ni));
      if (rem == 0 || rem == di) {
        return true;
      }
      if (di > rem) {
        return false;
      }
      ni = rem;
      shift = degree(ni) - dd;
    }
  }

  /**
   * Test if a polynomial in <code>GF(2)</code> divides another polynomial in <code>GF(2)</code>.
   * @param n polynomial
   * @param d divisor
   * @return true iff the divisor exactly divides the polynomial
   */
  public static boolean exactlyDivides(final Polynomial<Z> n, final Polynomial<Z> d) {
    return exactlyDivides(makeLong(n), makeLong(d), d.degree());
  }

  /**
   * Test if the given polynomial is a trinomial.
   * @param p polynomial to test.
   * @return true iff the polynomial is a trinomial
   */
  public static boolean isTrinomial(final Polynomial<Z> p) {
    int nonzero = 0;
    for (int k = 0; k <= p.degree(); ++k) {
      if (!p.coeff(k).isZero() && ++nonzero > 3) {
        return false;
      }
    }
    return nonzero == 3;
  }

  private static class IrreducibleIterator extends AbstractIterator<Polynomial<Z>> {

    private int mPos = -1;
    private final ArrayList<Polynomial<Z>> mIrreducibles = new ArrayList<>();
    {
      mIrreducibles.add(makePoly(2)); // x
      mIrreducibles.add(makePoly(3)); // x+1
      mIrreducibles.add(makePoly(7)); // x^2+x+1
    }
    private long mDoneToHere = 7;

    private Polynomial<Z> makePoly(long v) {
      final long[] c = new long[1 + degree(v)];
      for (int k = 0; k < c.length; ++k) {
        c[k] = v & 1L;
        v >>>= 1;
      }
      return Polynomial.create(c);
    }

    private void findNextIrreducible() {
      while (true) {
        do {
          mDoneToHere += 2L;
        } while (((long) Long.bitCount(mDoneToHere) & 1) == 0);

        final Polynomial<Z> candidate = makePoly(mDoneToHere);
        final int dLimit = candidate.degree() / 2;
        for (int k = 2; k < mIrreducibles.size(); ++k) {
          final Polynomial<Z> d = mIrreducibles.get(k);
          if (d.degree() > dLimit) {
            mIrreducibles.add(makePoly(mDoneToHere));
            return;
          }
          if (exactlyDivides(candidate, d)) {
            break;
          }
        }
      }
    }

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Polynomial<Z> next() {
      if (++mPos >= mIrreducibles.size()) {
        findNextIrreducible();
      }
      return mIrreducibles.get(mPos);
    }
  }

  /**
   * Minimum <code>k</code> such that <code>p(x) | x^k-1</code>.  Assumes
   * <code>p(x)</code> is irreducible and not <code>x</code>.
   *
   * @param poly an irreducible polynomial over <code>GF(2)</code>
   * @return exponent
   */
  public static int exponent(final Polynomial<Z> poly) {
    final long pi = makeLong(poly);
    final Z[] possibleExponents = Jaguar.factor(Z.ONE.shiftLeft(degree(pi)).subtract(1)).divisors();
    Arrays.sort(possibleExponents);
    //System.out.println(Arrays.toString(possibleExponents) +  " poly=" + poly +  " deg=" + degree(pi));
    for (final Z exp : possibleExponents) {
      final int e = exp.intValue();

      //System.out.println(exactlyDivides((1L << e) + 1, makeLong(poly), poly.degree()));
      //System.out.println(exactlyDivides(Z.ONE.shiftLeft(e).add(1), makeZ(poly), poly.degree()));

      if (exactlyDivides(Z.ONE.shiftLeft(e).add(1), makeZ(poly), poly.degree())) {
        return e;
      }
    }
    // This should never happen for a well formed irreducible
    throw new UnsupportedOperationException();
  }

  /**
   * Compute powers in a field.
   * @param ring underlying ring
   * @param x base
   * @param n exponent
   * @param mod modulus
   * @return power
   */
  public static Polynomial<Z> powMod(final PolynomialRingField<Z> ring, final Polynomial<Z> x, final Z n, final Polynomial<Z> mod) {
    // x^0
    if (n.isZero()) {
      return ring.one();
    }
    // x^1
    if (Z.ONE.equals(n)) {
      return x;
    }
    // x^2 (this case for efficiency)
    if (Z.TWO.equals(n)) {
      return ring.mod(ring.multiply(x, x), mod);
    }
    final Polynomial<Z> s = powMod(ring, ring.mod(ring.multiply(x, x), mod), n.divide2(), mod);
    return n.isEven() ? s : ring.mod(ring.multiply(s, x), mod);
  }

  /**
   * Test if the given polynomial is irreducible over <code>GF(q)[x]</code>
   * @param q field order
   * @param f polynomial
   * @return true iff the polynomial is irreducible
   */
  public static boolean isIrreducible(final GaloisField q, final Polynomial<Z> f) {
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(q);
    final int n = f.degree();
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final Polynomial<Z> h = ring.mod(ring.subtract(powMod(ring, ring.x(), q.size().pow(n / p.intValue()), f), ring.x()), f);
      final Polynomial<Z> g = ring.gcd(f, h);
      if (!ring.one().equals(g)) {
        return false;
      }
    }
    final Polynomial<Z> g = ring.mod(ring.subtract(powMod(ring, ring.x(), q.size().pow(n), f), ring.x()), f);
    return ring.zero().equals(g);
  }


  /**
   * Print irreducible polynomials.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Iterator<Polynomial<Z>> pi = IrreduciblePolynomials.iterator();
    pi.next(); // skip x
    while (pi.hasNext()) {
      final Polynomial<Z> p = pi.next();
      System.out.println(p.toString() + " exp=" + exponent(p));
    }
  }
}

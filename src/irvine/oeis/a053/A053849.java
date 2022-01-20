package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053849 Number of n X n matrices over GF(3) of order dividing 5 (i.e., number of solutions of X^5=I in GL(n,3)).
 * @author Sean A. Irvine
 */
public class A053849 implements Sequence {

  // After Andrew Howroyd

  protected int mN = 0;
  private final long mQ;
  private final int[] mDegrees; // Degrees of factors of (1-x^k) over GF(q)

  protected A053849(final long q, final int... degrees) {
    mQ = q;
    mDegrees = degrees;
  }

  /** Construct the sequence. */
  public A053849() {
    this(3L, 1, 4);
  }

  private Polynomial<Q> b(final int n, final long q, final int e) {
    final Z qz = Z.valueOf(q);
    final Q[] coeffs = new Q[n + 1];
    Arrays.fill(coeffs, Q.ZERO);
    for (int m = 0; m <= n / e; ++m) {
      final int me = m * e;
      Z prod = Z.ONE;
      for (int k = 0; k < m; ++k) {
        prod = prod.multiply(qz.pow(me).subtract(qz.pow(k * (long) e)));
      }
      coeffs[me] = new Q(Z.ONE, prod);
    }
    return Polynomial.create(coeffs);
  }

  private Z f(final int n, final long q) {
    final PolynomialRingField<Q> rat = new PolynomialRingField<>(Rationals.SINGLETON);
    Polynomial<Q> p = rat.one();
    for (final int v : mDegrees) {
      p = rat.multiply(p, b(n, q, v));
    }
    final Polynomial<Q> r = b(n, q, 1);
    return p.coeff(n).divide(r.coeff(n)).toZ();
  }

  @Override
  public Z next() {
    return f(++mN, mQ);
  }

  /**
   * Noddy main.
   * @param args degree sequence.
   */
  public static void main(final String[] args) {
    final int[] deg = new int[args.length];
    for (int k = 0; k < args.length; ++k) {
      deg[k] = Integer.parseInt(args[k]);
    }
    final Sequence seq = new A053849(2L, deg);
    for (int k = 0; k < 10; ++k) {
      System.out.println(seq.next());
    }
  }
}

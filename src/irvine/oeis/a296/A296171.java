package irvine.oeis.a296;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A296171 O.g.f. A(x) satisfies: <code>[x^n]</code> exp( <code>n^2 *</code> A(x) <code>) = [x^(n-1)]</code> exp( <code>n^2 *</code> A(x) ) for <code>n&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A296171 extends A296170 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    stepEgf();
    mA.set(0, Q.ZERO); // so that log1p works
    final Polynomial<Q> log = RING.log1p(RING.create(mA), mN);
    mA.set(0, Q.ONE);
    final Q coeff = log.coeff(mN);
    if (!coeff.isInteger()) {
      throw new UnsupportedOperationException("Sequence is not an integer at n=" + mN);
    }
    return coeff.toZ();
  }

  /**
   * Direct computation to specified number of terms.
   * @param args number of terms
   */
  public static void main(final String[] args) {
    final A296171 seq = new A296171();
    final int limit = Integer.parseInt(args[0]);
    for (int k = 0; k < limit; ++k) {
      System.out.println(String.valueOf(k));
      seq.stepEgf();
    }
    seq.mA.set(0, Q.ZERO);
    System.out.println(RING.log1p(RING.create(seq.mA), limit));
  }
}

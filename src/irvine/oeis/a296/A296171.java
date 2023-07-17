package irvine.oeis.a296;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A296171 O.g.f. A(x) satisfies: [x^n] exp( n^2 * A(x) )  =   [x^(n-1)] exp( n^2 * A(x) ) for n&gt;=1.
 * @author Sean A. Irvine
 */
public class A296171 extends A296170 {

  /** Construct the sequence. */
  public A296171() {
    super(1);
  }

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

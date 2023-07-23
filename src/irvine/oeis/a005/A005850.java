package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002315;

/**
 * A005850 Primes p such that the NSW number A002315((p-1)/2) is prime.
 * @author Sean A. Irvine
 */
public class A005850 extends AbstractSequence {

  private final A002315 mSeq1 = new A002315();

  /** Construct the sequence. */
  public A005850() {
    super(1);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = mSeq1.next();
      final Z p = mN.multiply2().add(1);
      if (v.isProbablePrime() && p.isProbablePrime()) {
        return p;
      }
    }
  }
}

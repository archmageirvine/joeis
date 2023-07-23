package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A063535 Primes prime(n) such that prime(n+1)^2 &lt; prime(n)*prime(n+2).
 * @author Sean A. Irvine
 */
public class A063535 extends AbstractSequence {

  private final A000040 mSeq1 = new A000040();

  /** Construct the sequence. */
  public A063535() {
    super(0);
  }

  private Z mP = mSeq1.next();
  private Z mQ = mSeq1.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = mQ;
      mQ = mSeq1.next();
      if (mP.square().compareTo(t.multiply(mQ)) < 0) {
        return t;
      }
    }
  }
}

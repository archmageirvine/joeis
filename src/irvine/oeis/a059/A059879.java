package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059879 Those n for which the absolute value of A059878[n] is prime.
 * @author Sean A. Irvine
 */
public class A059879 extends AbstractSequence {

  private final A059878 mSeq1 = new A059878();

  /** Construct the sequence. */
  public A059879() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

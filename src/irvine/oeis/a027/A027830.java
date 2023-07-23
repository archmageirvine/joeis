package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027830 Numbers k such that k + (k+1)^2 + (k+2)^3 + (k+3)^4 + (k+4)^5 is prime.
 * @author Sean A. Irvine
 */
public class A027830 extends AbstractSequence {

  private final A027622 mSeq1 = new A027622();

  /** Construct the sequence. */
  public A027830() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

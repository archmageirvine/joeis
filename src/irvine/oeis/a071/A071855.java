package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000720;
import irvine.oeis.a067.A067434;

/**
 * A071855 Numbers n such that A067434(n) = A000720(n) + A000005(n).
 * @author Sean A. Irvine
 */
public class A071855 extends Sequence1 {

  private final A067434 mSeq1 = new A067434();
  private final A000720 mSeq2 = new A000720();
  private final A000005 mSeq3 = new A000005();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().equals(mSeq2.next().add(mSeq3.next()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

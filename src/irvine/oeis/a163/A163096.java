package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;

/**
 * A163096 Odd numbers with an even number of partitions.
 * @author Sean A. Irvine
 */
public class A163096 extends Sequence1 {

  private long mN = -1;
  private final A000041 mSeq = new A000041();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      mSeq.next();
      if (mSeq.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}


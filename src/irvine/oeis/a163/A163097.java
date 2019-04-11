package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A163097 Even numbers with <code>an</code> odd number of partitions.
 * @author Sean A. Irvine
 */
public class A163097 implements Sequence {

  private long mN = -2;
  private final A000041 mSeq = new A000041();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = mSeq.next();
      mSeq.next();
      if (!t.isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}


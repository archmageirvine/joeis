package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A067381.
 * @author Sean A. Irvine
 */
public class A067381 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return new A067380(2, MemorySequence.cachedSequence(new A000040()), ++mN).next();
  }
}


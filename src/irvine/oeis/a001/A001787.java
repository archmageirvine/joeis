package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001787.
 * @author Sean A. Irvine
 */
public class A001787 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN - 1);
  }
}

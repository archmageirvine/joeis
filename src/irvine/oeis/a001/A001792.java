package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001792.
 * @author Sean A. Irvine
 */
public class A001792 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 3).shiftLeft(mN);
  }
}

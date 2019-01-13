package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001550.
 * @author Sean A. Irvine
 */
public class A001550 implements Sequence {

  private Z mTwo = null;
  private Z mThree = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
    }
    return mThree.add(mTwo).add(1);
  }
}

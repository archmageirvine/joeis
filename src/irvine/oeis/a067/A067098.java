package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067098 Floor[X/Y] where X = concatenation in increasing order of first n powers of 3 and Y = that of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A067098 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(Z.THREE.pow(++mN));
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}

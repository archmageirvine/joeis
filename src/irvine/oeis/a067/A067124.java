package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067124 Floor [sqrt{concatenation of first n squares}].
 * @author Sean A. Irvine
 */
public class A067124 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mX.append(++mN * mN);
    return new Z(mX).sqrt();
  }
}

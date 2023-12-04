package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067125 Floor(cube root(concatenation of first n cubes)).
 * @author Sean A. Irvine
 */
public class A067125 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mX.append(Z.valueOf(++mN).pow(3));
    return new Z(mX).root(3);
  }
}

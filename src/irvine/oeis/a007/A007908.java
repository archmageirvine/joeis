package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007908.
 * @author Sean A. Irvine
 */
public class A007908 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(++mN);
    return new Z(mS.toString());
  }
}

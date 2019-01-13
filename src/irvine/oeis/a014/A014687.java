package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014687.
 * @author Sean A. Irvine
 */
public class A014687 extends A000040 {

  private long mSign = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    mSign = -mSign;
    return super.next().add(mSign);
  }
}

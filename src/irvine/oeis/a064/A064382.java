package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a022.A022915;

/**
 * A064379.
 * @author Sean A. Irvine
 */
public class A064382 extends A022915 {

  private long mN = -1;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

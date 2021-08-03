package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049477 Values of n-g associated with sequences A070862 and A088859.
 * @author Sean A. Irvine
 */
public class A049477 extends A049476 {

  private Sequence mA = new A049478();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

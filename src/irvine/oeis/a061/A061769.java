package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a011.A011778;

/**
 * A061769.
 * @author Sean A. Irvine
 */
public class A061769 extends A011778 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

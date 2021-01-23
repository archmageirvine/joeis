package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A004072 Read the terms of A004071 backwards.
 * @author Sean A. Irvine
 */
public class A004072 extends A004071 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }

}

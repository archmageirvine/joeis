package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a011.A011545;

/**
 * A092845.
 * @author Sean A. Irvine
 */
public class A092845 extends A011545 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

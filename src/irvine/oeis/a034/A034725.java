package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A034725 Product of digits of A034686(n).
 * @author Sean A. Irvine
 */
public class A034725 extends A034686 {

  @Override
  public Z next() {
    return ZUtils.digitProduct(super.next());
  }
}


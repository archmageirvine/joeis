package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a006.A006939;

/**
 * A051357 Chernoff sequence A006939 divided by 2.
 * @author Sean A. Irvine
 */
public class A051357 extends A006939 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

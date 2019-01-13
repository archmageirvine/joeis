package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a006.A006960;

/**
 * A011375.
 * @author Sean A. Irvine
 */
public class A011375 extends A006960 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}

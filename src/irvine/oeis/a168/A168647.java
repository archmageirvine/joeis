package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a164.A164844;

/**
 * A168647 Reverse (palindrome) of A164844.
 * @author Georg Fischer
 */
public class A168647 extends A164844 {

  @Override
  public Z next() {
    return ZUtils.reverse(super.next());
  }
}

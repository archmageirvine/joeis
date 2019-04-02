package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a081.A081844;

/**
 * A006694 Number of cyclotomic cosets of 2 mod 2n+1.
 * @author Sean A. Irvine
 */
public class A006694 extends A081844 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

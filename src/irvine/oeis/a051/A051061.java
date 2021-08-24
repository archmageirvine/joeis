package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051061 Record subsequence of b(3k+2), b()=A048141().
 * @author Sean A. Irvine
 */
public class A051061 extends A048141 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}

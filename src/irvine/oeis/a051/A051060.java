package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051060 Record subsequence of b(3k+1), b()=A048141().
 * @author Sean A. Irvine
 */
public class A051060 extends A048141 {

  @Override
  public Z next() {
    super.next();
    final Z t = super.next();
    super.next();
    return t;
  }
}

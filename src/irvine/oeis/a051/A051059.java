package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051059 Record subsequence of b(3k), b()=A048141().
 * @author Sean A. Irvine
 */
public class A051059 extends A048141 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    super.next();
    return t;
  }
}

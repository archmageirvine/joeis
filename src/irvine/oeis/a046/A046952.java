package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A046952 Sets record for f(n) = |{(a,b):a*b=n and a|b}|. Also squares of highly composite numbers A002182.
 * @author Sean A. Irvine
 */
public class A046952 extends A002182 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

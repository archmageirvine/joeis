package irvine.oeis.a076;
// manually n2/n2add1 at 2022-04-06 21:32

import irvine.math.z.Z;
import irvine.oeis.a006.A006530;

/**
 * A076565 Greatest prime divisor of 2n+1 (sum of two successive integers).
 * @author Georg Fischer
 */
public class A076565 extends A006530 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

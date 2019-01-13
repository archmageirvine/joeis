package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A003668.
 * @author Sean A. Irvine
 */
public class A003668 extends A002858 {

  @Override
  protected Z a1() {
    return Z.TWO;
  }

  @Override
  protected Z a2() {
    return Z.SEVEN;
  }
}

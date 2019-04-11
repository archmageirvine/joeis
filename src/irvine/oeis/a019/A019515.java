package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000178;

/**
 * A019515 <code>a(n) = 1 + 0!*1!*2!*...*n!</code>.
 * @author Sean A. Irvine
 */
public class A019515 extends A000178 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}


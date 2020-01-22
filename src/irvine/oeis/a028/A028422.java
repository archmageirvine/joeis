package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a001.A001055;

/**
 * A028422.
 * @author Sean A. Irvine
 */
public class A028422 extends A001055 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A001248.
 * @author Sean A. Irvine
 */
public class A001248 extends A000040 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

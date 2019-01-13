package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A001255.
 * @author Sean A. Irvine
 */
public class A001255 extends A000041 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

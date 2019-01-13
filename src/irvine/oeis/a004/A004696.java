package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004696.
 * @author Sean A. Irvine
 */
public class A004696 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}


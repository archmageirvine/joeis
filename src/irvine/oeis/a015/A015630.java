package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a007.A007992;

/**
 * A015630.
 * @author Sean A. Irvine
 */
public class A015630 extends A007992 {

  @Override
  protected Z select(final Z small, final Z big) {
    return big;
  }
}

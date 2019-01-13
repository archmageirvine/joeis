package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001611.
 * @author Sean A. Irvine
 */
public class A001611 extends A000045 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

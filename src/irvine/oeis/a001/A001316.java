package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001316.
 * @author Sean A. Irvine
 */
public class A001316 extends A000120 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue());
  }
}

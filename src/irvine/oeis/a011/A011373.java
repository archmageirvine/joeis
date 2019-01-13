package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011373.
 * @author Sean A. Irvine
 */
public class A011373 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}

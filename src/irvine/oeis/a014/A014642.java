package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000326;

/**
 * A014642.
 * @author Sean A. Irvine
 */
public class A014642 extends A000326 {

  @Override
  public Z next() {
    return super.next().shiftLeft(3);
  }
}

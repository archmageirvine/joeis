package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000326;

/**
 * A014642 Even octagonal numbers: a(n) = 4*n*(3*n-1).
 * @author Sean A. Irvine
 */
public class A014642 extends A000326 {

  @Override
  public Z next() {
    return super.next().shiftLeft(3);
  }
}

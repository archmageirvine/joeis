package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A069935 Maximal power of 2 that divides the n-th partition number.
 * @author Sean A. Irvine
 */
public class A069935 extends A000041 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().makeOdd().auxiliary());
  }
}

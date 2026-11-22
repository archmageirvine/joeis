package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.a333.A333351;

/**
 * A367497 Number of 4-regular loopless multigraphs on n vertices.
 * @author Gregory Morse
 */
public class A367497 extends A333351 {
  private int mN = -1;

  @Override
  public Z next() {
    return regular(++mN, 4);
  }
}

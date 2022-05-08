package irvine.oeis.a177;
// manually tricolel

import irvine.math.z.Z;
import irvine.oeis.a242.A242784;

/**
 * A177521 Number of permutations of 1..n avoiding adjacent step pattern up, down, up, up.
 * @author Georg Fischer
 */
public class A177521 extends A242784 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.matrixElement(++mN, 13);
  }
}

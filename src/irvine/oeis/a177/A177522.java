package irvine.oeis.a177;
// manually tricolel

import irvine.math.z.Z;
import irvine.oeis.a242.A242784;

/**
 * A177522 Number of permutations of 1..n avoiding adjacent step pattern up, up, down, down.
 * @author Georg Fischer
 */
public class A177522 extends A242784 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.matrixElement(++mN, 12);
  }
}

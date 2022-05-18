package irvine.oeis.a204;
// manually A204459/arronk

import irvine.math.z.Z;

/**
 * A204464 Number of 2*n-element subsets that can be chosen from {1, 2,..., 16*n} having element sum n*(16*n+1).
 * @author Georg Fischer
 */
public class A204464 extends A204459 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(8, mN++);
  }
}


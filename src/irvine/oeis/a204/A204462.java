package irvine.oeis.a204;
// manually A204459/arronk

import irvine.math.z.Z;

/**
 * A204462 Number of 2*n-element subsets that can be chosen from {1,2,...,12*n} having element sum n*(12*n+1).
 * @author Georg Fischer
 */
public class A204462 extends A204459 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(6, mN++);
  }
}


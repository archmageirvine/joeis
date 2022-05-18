package irvine.oeis.a204;
// manually A204459/arronk

import irvine.math.z.Z;

/**
 * A204466 Number of 2*n-element subsets that can be chosen from {1, 2,..., 20*n} having element sum n*(20*n+1).
 * @author Georg Fischer
 */
public class A204466 extends A204459 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(10, mN++);
  }
}


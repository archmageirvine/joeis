package irvine.oeis.a204;
// manually triuple at 2021-10-25 09:05

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204244 Symmetric matrix given by f(i,1)=1, f(1,j)=1, f(i,i)=i! and f(i,j)=0 otherwise.
 *
 * @author Georg Fischer
 */
public class A204244 extends UpperLeftTriangle {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /**
   * Construct the sequence.
   */
  public A204244() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return i == 1 || j == 1 ? Z.ONE : (i == j ? FACTORIAL.factorial(i) : Z.ZERO);
  }
}

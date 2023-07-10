package irvine.oeis.a354;
// manually 2023-07-10

import irvine.math.z.Z;
import irvine.oeis.a346.A346241;

/**
 * A354807 a(n) = 1 if A346241(n) is negative, and 0 otherwise, where A346241 is the Dirichlet inverse of {A003415, arithmetic derivative of n + A063524 (1, 0, 0, 0, ...)}.
 * @author Georg Fischer
 */
public class A354807 extends A346241 {

  @Override
  public Z next() {
    return super.next().compareTo(Z.ZERO) < 0 ? Z.ONE : Z.ZERO;
  }
}

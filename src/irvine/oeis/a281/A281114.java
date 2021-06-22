package irvine.oeis.a281;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a061.A061304;

/**
 * A281114 Parity of the n-th squarefree triangular number.
 * @author Georg Fischer
 */

public class A281114 extends A061304 {
  
  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}

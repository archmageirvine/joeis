package irvine.oeis.a061;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a010.A010051;

/**
 * A061397 Characteristic function sequence of primes multiplied componentwise by N, the natural numbers.
 * @author Georg Fischer
 */

public class A061397 extends A010051 {
    
  protected int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mN);
  }
}

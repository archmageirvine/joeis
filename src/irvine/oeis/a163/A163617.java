package irvine.oeis.a163;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163617 a(2*n) = 2*a(n), a(2*n + 1) = 2*a(n) + 2 + (-1)^n, for all n in Z.
 * @author Georg Fischer
 */

public class A163617 implements Sequence {
  
  protected int mN = -1;
    
  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.or(n.multiply2());
  }
}

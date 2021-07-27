package irvine.oeis.a163;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a003.A003052;

/**
 * A163128 a(n) is the n-th self-number minus n.
 * @author Georg Fischer
 */
public class A163128 extends A003052 {
    
  protected int mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(Z.valueOf(++mN));
  }
}

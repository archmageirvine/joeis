package irvine.oeis.a163;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a001.A001898;

/**
 * A163128 a(n) is the n-th self-number minus n.
 * a(n) = A001898(n-1)/n.
 * @author Georg Fischer
 */

public class A163176 extends A001898 {
    
  protected int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(Z.valueOf(++mN));
  }
}

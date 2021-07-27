package irvine.oeis.a163;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a001.A001898;

/**
 * A163176 The n-th Minkowski number divided by the n-th factorial: a(n) = A053657(n)/n!.
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

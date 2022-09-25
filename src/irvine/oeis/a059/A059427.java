package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a008.A008970;

/**
 * A059427 Triangle read by rows: T(n,k) is the number of permutations of [n] with k alternating runs (n&gt;=2, k&gt;=1).
 * @author Sean A. Irvine
 */
public class A059427 extends A008970 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

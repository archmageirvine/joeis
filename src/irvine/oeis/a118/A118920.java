package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.a039.A039598;

/**
 * A118920 Triangle read by rows: T(n,k) is the number of Grand Dyck paths of semilength n that cross the x-axis k times (n&gt;=1, k&gt;=0).
 * @author Georg Fischer
 */
public class A118920 extends A039598 {

  /** Construct the sequence. */
  public A118920() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

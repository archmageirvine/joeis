package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.a056.A056951;

/**
 * A162630 Triangle read by rows in which row n lists the number of states of the subshells of the n-th shell of the nuclear shell model ordered by energy level in increasing order.
 * of the n-th shell of the nuclear shell model ordered by energy level in increasing order.
 * @author Georg Fischer
 */
public class A162630 extends A056951 {

  @Override
  public Z next() {
    return super.next().abs().multiply2();
  }
}

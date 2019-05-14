package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166072 Define <code>dsf(n) = A045503(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}</code>, where <code>{n_1,n_2,n_3,...n_m}</code> is the list of the decimal digits of n. <code>dsf(809265896) = 808491852</code> and <code>dsf(808491852) = 437755524,...,dsf(792488396) = 809265896</code>, so these 8 numbers make a loop for the function <code>dsf</code>.
 * @author Sean A. Irvine
 */
public class A166072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166072() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {809265896, 808491852, 437755524, 1657004, 873583, 34381154, 16780909, 792488396});
  }
}

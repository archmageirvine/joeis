package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166072 Define dsf(n) = A045503(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}, where {n_1,n_2,n_3,...n_m} is the list of the decimal digits of n. dsf(809265896) = 808491852 and dsf(808491852) = 437755524,...,dsf(792488396) = 809265896, so these 8 numbers make a loop for the function dsf.
 * @author Sean A. Irvine
 */
public class A166072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166072() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {809265896, 808491852, 437755524, 1657004, 873583, 34381154, 16780909, 792488396});
  }
}

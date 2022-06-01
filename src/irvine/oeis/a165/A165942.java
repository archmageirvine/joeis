package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165942 For a nonnegative integer n, define dsf(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}, where {n_1,n_2,n_3,...n_m} is the list of the digits of an integer n. Then a(n+1) = dsf(a(n)).
 * @author Sean A. Irvine
 */
public class A165942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165942() {
    super(new long[] {1, 0, 0}, new long[] {3418, 16777500, 2520413});
  }
}

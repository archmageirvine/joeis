package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166024 Define dsf(n) = A045503(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}, where {n_1,n_2,n_3,...n_m} is the list of the decimal digits of n. dsf(421845123) = 16780890 and dsf(16780890) = 421845123, so these 2 numbers make a loop for the function dsf.
 * @author Sean A. Irvine
 */
public class A166024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166024() {
    super(1, new long[] {1, 0}, new long[] {421845123, 16780890});
  }
}

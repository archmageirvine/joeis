package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085350 Binomial transform of poly-Bernoulli numbers A027649.
 * @author Sean A. Irvine
 */
public class A085350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085350() {
    super(new long[] {-12, 7}, new long[] {1, 5});
  }
}

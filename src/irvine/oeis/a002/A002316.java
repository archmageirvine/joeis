package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002316 Related to Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A002316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002316() {
    super(new long[] {-1, -6, -11, 6}, new long[] {1, 5, 26, 97});
  }
}

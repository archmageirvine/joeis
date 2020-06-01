package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236432 <code>a(n) = (2n-1)*210;</code> numbers which are 210 times an odd number.
 * @author Sean A. Irvine
 */
public class A236432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236432() {
    super(new long[] {-1, 2}, new long[] {210, 630});
  }
}

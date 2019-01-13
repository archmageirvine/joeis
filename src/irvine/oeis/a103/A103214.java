package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103214.
 * @author Sean A. Irvine
 */
public class A103214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103214() {
    super(new long[] {-1, 2}, new long[] {1, 25});
  }
}

package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103196.
 * @author Sean A. Irvine
 */
public class A103196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103196() {
    super(new long[] {2, 3, 0}, new long[] {1, 2, 3});
  }
}

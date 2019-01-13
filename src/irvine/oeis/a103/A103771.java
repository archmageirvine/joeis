package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103771.
 * @author Sean A. Irvine
 */
public class A103771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103771() {
    super(new long[] {4, 4, 4}, new long[] {1, 4, 20});
  }
}

package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091903.
 * @author Sean A. Irvine
 */
public class A091903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091903() {
    super(new long[] {50, 5}, new long[] {0, 1});
  }
}

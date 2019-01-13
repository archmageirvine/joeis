package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052920.
 * @author Sean A. Irvine
 */
public class A052920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052920() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0});
  }
}

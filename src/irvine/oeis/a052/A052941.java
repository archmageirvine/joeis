package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052941.
 * @author Sean A. Irvine
 */
public class A052941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052941() {
    super(new long[] {-1, -1, 4}, new long[] {1, 3, 11});
  }
}

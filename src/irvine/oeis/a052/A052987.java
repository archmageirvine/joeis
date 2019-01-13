package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052987.
 * @author Sean A. Irvine
 */
public class A052987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052987() {
    super(new long[] {-2, 2, 2}, new long[] {1, 2, 4});
  }
}

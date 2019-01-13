package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021404.
 * @author Sean A. Irvine
 */
public class A021404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021404() {
    super(new long[] {-144, 240, -115, 20}, new long[] {1, 20, 285, 3640});
  }
}

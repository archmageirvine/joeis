package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021264.
 * @author Sean A. Irvine
 */
public class A021264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021264() {
    super(new long[] {-144, 250, -125, 20}, new long[] {1, 20, 275, 3250});
  }
}

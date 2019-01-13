package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129005.
 * @author Sean A. Irvine
 */
public class A129005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129005() {
    super(new long[] {-625, 500, -150, 20}, new long[] {0, 10, 300, 4500});
  }
}

package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028199.
 * @author Sean A. Irvine
 */
public class A028199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028199() {
    super(new long[] {-6600, 3130, -527, 38}, new long[] {1, 38, 917, 17950});
  }
}

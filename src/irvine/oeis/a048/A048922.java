package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048922.
 * @author Sean A. Irvine
 */
public class A048922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048922() {
    super(new long[] {1, -675, 675}, new long[] {1, 425, 286209});
  }
}

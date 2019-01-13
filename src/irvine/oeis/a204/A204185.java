package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204185.
 * @author Sean A. Irvine
 */
public class A204185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204185() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 0, 6, 33, 102, 243});
  }
}

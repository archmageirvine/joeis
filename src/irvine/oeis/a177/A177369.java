package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177369.
 * @author Sean A. Irvine
 */
public class A177369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177369() {
    super(new long[] {-4, 4, 3}, new long[] {1, 7, 21});
  }
}

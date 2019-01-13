package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132158.
 * @author Sean A. Irvine
 */
public class A132158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132158() {
    super(new long[] {5, -5, 5, -1, 1}, new long[] {0, 1, 3, 6, 11});
  }
}

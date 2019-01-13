package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190914.
 * @author Sean A. Irvine
 */
public class A190914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190914() {
    super(new long[] {-1, 0, 1, 3, 0}, new long[] {5, 0, 6, 3, 18});
  }
}

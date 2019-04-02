package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244872 Number of magic labelings with magic sum n of 4th graph shown in link.
 * @author Sean A. Irvine
 */
public class A244872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244872() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {1, 15, 114, 569, 2138, 6562, 17329, 40765, 87512});
  }
}

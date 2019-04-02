package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156664 Binomial transform of A052551.
 * @author Sean A. Irvine
 */
public class A156664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156664() {
    super(new long[] {-2, -3, 4}, new long[] {1, 2, 6});
  }
}

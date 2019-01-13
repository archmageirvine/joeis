package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275906.
 * @author Sean A. Irvine
 */
public class A275906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275906() {
    super(new long[] {1, 4, 4}, new long[] {1, 5, 25});
  }
}

package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141759.
 * @author Sean A. Irvine
 */
public class A141759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141759() {
    super(new long[] {1, -3, 3}, new long[] {15, 63, 143});
  }
}

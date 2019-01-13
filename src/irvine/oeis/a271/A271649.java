package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271649.
 * @author Sean A. Irvine
 */
public class A271649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271649() {
    super(new long[] {1, -3, 3}, new long[] {4, 8, 16});
  }
}

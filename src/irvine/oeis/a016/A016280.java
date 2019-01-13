package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016280.
 * @author Sean A. Irvine
 */
public class A016280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016280() {
    super(new long[] {66, -61, 16}, new long[] {1, 16, 195});
  }
}

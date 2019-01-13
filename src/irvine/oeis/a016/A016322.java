package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016322.
 * @author Sean A. Irvine
 */
public class A016322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016322() {
    super(new long[] {198, -139, 22}, new long[] {1, 22, 345});
  }
}

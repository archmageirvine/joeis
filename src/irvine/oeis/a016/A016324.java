package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016324.
 * @author Sean A. Irvine
 */
public class A016324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016324() {
    super(new long[] {216, -150, 23}, new long[] {1, 23, 379});
  }
}

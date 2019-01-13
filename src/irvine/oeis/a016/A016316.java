package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016316.
 * @author Sean A. Irvine
 */
public class A016316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016316() {
    super(new long[] {144, -106, 19}, new long[] {1, 19, 255});
  }
}

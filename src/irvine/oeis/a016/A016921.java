package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016921.
 * @author Sean A. Irvine
 */
public class A016921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016921() {
    super(new long[] {-1, 2}, new long[] {1, 7});
  }
}

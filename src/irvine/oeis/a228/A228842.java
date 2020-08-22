package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228842 Binomial transform of A014448.
 * @author Sean A. Irvine
 */
public class A228842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228842() {
    super(new long[] {-4, 6}, new long[] {2, 6});
  }
}

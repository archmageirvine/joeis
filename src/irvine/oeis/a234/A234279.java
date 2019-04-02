package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234279 Number of spanning forests of a benzenoid chain of length n.
 * @author Sean A. Irvine
 */
public class A234279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234279() {
    super(new long[] {-16, 32}, new long[] {2, 63});
  }
}

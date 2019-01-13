package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091142.
 * @author Sean A. Irvine
 */
public class A091142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091142() {
    super(new long[] {-2, 4, 2}, new long[] {1, 2, 6});
  }
}

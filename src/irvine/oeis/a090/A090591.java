package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090591.
 * @author Sean A. Irvine
 */
public class A090591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090591() {
    super(new long[] {-8, 2}, new long[] {1, 2});
  }
}

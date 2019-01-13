package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053606.
 * @author Sean A. Irvine
 */
public class A053606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053606() {
    super(new long[] {1, -19, 19}, new long[] {0, 8, 152});
  }
}

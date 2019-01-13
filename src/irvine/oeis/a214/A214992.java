package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214992.
 * @author Sean A. Irvine
 */
public class A214992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214992() {
    super(new long[] {-1, 6, 6}, new long[] {7, 47, 323});
  }
}

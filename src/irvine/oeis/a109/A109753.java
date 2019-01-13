package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109753.
 * @author Sean A. Irvine
 */
public class A109753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109753() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 3, 0, 5, 0, 7});
  }
}

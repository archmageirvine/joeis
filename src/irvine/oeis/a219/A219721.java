package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219721.
 * @author Sean A. Irvine
 */
public class A219721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219721() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 8, 13, 20, 22});
  }
}

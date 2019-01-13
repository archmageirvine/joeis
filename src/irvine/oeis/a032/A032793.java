package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032793.
 * @author Sean A. Irvine
 */
public class A032793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032793() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 6});
  }
}

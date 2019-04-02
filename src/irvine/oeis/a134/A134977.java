package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134977 Period 6: repeat [1, 4, 2, 3, 0, 2].
 * @author Sean A. Irvine
 */
public class A134977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134977() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 2, 3});
  }
}

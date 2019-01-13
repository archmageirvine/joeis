package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264851.
 * @author Sean A. Irvine
 */
public class A264851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264851() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 20, 90, 260});
  }
}

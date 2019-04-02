package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176288 Hankel transform of A176287.
 * @author Sean A. Irvine
 */
public class A176288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176288() {
    super(new long[] {-16, 24, -17, 6}, new long[] {1, 3, 15, 55});
  }
}

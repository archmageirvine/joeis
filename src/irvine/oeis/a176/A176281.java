package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176281 Hankel transform of A176280.
 * @author Sean A. Irvine
 */
public class A176281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176281() {
    super(new long[] {8, -16, 8}, new long[] {1, 3, 12});
  }
}

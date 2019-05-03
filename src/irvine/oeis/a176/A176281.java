package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176281 Hankel transform of <code>A176280</code>.
 * @author Sean A. Irvine
 */
public class A176281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176281() {
    super(new long[] {8, -16, 8}, new long[] {1, 3, 12});
  }
}

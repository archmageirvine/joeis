package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226276 Period 4: repeat [8, 4, 4, 4].
 * @author Sean A. Irvine
 */
public class A226276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226276() {
    super(new long[] {1, 0, 0, 0}, new long[] {8, 4, 4, 4});
  }
}

package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226276 Period <code>4</code>: repeat <code>[8, 4, 4, 4]</code>.
 * @author Sean A. Irvine
 */
public class A226276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226276() {
    super(new long[] {1, 0, 0, 0}, new long[] {8, 4, 4, 4});
  }
}

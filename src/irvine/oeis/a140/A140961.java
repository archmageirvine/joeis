package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140961.
 * @author Sean A. Irvine
 */
public class A140961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140961() {
    super(new long[] {240, -118, 19}, new long[] {1, 17, 205});
  }
}

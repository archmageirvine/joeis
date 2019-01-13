package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193578.
 * @author Sean A. Irvine
 */
public class A193578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193578() {
    super(new long[] {-13, 14}, new long[] {1, 7});
  }
}

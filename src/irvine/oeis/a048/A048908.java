package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048908.
 * @author Sean A. Irvine
 */
public class A048908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048908() {
    super(new long[] {1, -17, 17}, new long[] {1, 25, 406});
  }
}

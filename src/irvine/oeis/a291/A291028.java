package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291028.
 * @author Sean A. Irvine
 */
public class A291028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291028() {
    super(new long[] {-1, 10, -19, 10}, new long[] {6, 47, 362, 2787});
  }
}

package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027608.
 * @author Sean A. Irvine
 */
public class A027608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027608() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {1, 9, 49, 209, 769});
  }
}

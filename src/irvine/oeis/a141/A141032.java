package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141032 4*(16^n-1)/15.
 * @author Sean A. Irvine
 */
public class A141032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141032() {
    super(new long[] {-16, 17}, new long[] {0, 4});
  }
}

package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140657 Powers of 2 with 3 alternatingly added and subtracted.
 * @author Sean A. Irvine
 */
public class A140657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140657() {
    super(new long[] {2, 1}, new long[] {4, -1});
  }
}

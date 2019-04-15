package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092055 <code>C(2+2^n,3)</code>.
 * @author Sean A. Irvine
 */
public class A092055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092055() {
    super(new long[] {64, -56, 14}, new long[] {1, 4, 20});
  }
}

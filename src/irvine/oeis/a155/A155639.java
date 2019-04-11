package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155639 <code>6^n-5^n+1^n</code>.
 * @author Sean A. Irvine
 */
public class A155639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155639() {
    super(new long[] {30, -41, 12}, new long[] {1, 2, 12});
  }
}

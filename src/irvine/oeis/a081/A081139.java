package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081139 9th binomial transform of <code>(0,0,1,0,0,0,</code>...).
 * @author Sean A. Irvine
 */
public class A081139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081139() {
    super(new long[] {729, -243, 27}, new long[] {0, 0, 1});
  }
}

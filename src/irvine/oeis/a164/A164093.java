package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164093 <code>9*4^n+2</code>.
 * @author Sean A. Irvine
 */
public class A164093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164093() {
    super(new long[] {-4, 5}, new long[] {38, 146});
  }
}

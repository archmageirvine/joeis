package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083812 <code>4n-1</code> is the digit reversal of <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A083812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083812() {
    super(new long[] {-10, 11}, new long[] {18, 198});
  }
}

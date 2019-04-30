package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081077 <code>Lucas(4n+2)+3</code>, or <code>Lucas(2n)*Lucas(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081077() {
    super(new long[] {1, -8, 8}, new long[] {6, 21, 126});
  }
}

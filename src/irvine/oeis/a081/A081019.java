package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081019 <code>Lucas(4n+3)-1,</code> or <code>Lucas(2n+1)*Lucas(2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A081019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081019() {
    super(new long[] {1, -8, 8}, new long[] {3, 28, 198});
  }
}

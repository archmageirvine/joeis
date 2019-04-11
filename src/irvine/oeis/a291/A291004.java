package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291004 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= (1 -</code> 3*S)^2.
 * @author Sean A. Irvine
 */
public class A291004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291004() {
    super(new long[] {-16, 8}, new long[] {6, 33});
  }
}

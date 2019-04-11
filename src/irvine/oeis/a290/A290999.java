package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290999 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= 1 -</code> 6*S^2.
 * @author Sean A. Irvine
 */
public class A290999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290999() {
    super(new long[] {5, 2}, new long[] {0, 6});
  }
}

package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056854 <code>a(n) =</code> Lucas(4*n).
 * @author Sean A. Irvine
 */
public class A056854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056854() {
    super(new long[] {-1, 7}, new long[] {2, 7});
  }
}

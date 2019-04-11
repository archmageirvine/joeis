package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066982 <code>a(n) =</code> Lucas(n+1) <code>- (n+1)</code>.
 * @author Sean A. Irvine
 */
public class A066982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066982() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 3, 6});
  }
}

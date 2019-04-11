package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109109 <code>a(0)=1, a(1)=4, a(n) = 10a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A109109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109109() {
    super(new long[] {1, 10}, new long[] {1, 4});
  }
}

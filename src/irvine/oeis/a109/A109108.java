package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109108 <code>a(n) = 10a(n-1) + a(n-2), a(0)=1, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A109108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109108() {
    super(new long[] {1, 10}, new long[] {1, 9});
  }
}

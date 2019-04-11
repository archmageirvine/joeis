package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191014 <code>a(n) = 10*a(n-1) + 2*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A191014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191014() {
    super(new long[] {2, 10}, new long[] {0, 1});
  }
}

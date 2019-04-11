package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182190 <code>a(n) = 6*a(n-1) - a(n-2) + 4</code> with <code>n&gt;1, a(0)=0, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A182190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182190() {
    super(new long[] {1, -7, 7}, new long[] {0, 4, 28});
  }
}

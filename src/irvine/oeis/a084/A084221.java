package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084221 <code>a(n+2) = 4*a(n),</code> with <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A084221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084221() {
    super(new long[] {4, 0}, new long[] {1, 3});
  }
}

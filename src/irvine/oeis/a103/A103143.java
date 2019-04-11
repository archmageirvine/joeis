package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103143 <code>a(n)=a(n-1)+a(n-2)+3a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A103143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103143() {
    super(new long[] {3, 1, 1}, new long[] {0, 0, 1});
  }
}

package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276276 <code>a(n) = a(n-2)+a(n-3)</code> with <code>a(1)=2 a(2)=1 a(3)=0</code>.
 * @author Sean A. Irvine
 */
public class A276276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276276() {
    super(new long[] {1, 1, 0}, new long[] {2, 1, 0});
  }
}

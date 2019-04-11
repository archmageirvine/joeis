package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192937 <code>a(n) = 100*a(n-1) - (n-1)</code> with <code>a(1)=100</code>.
 * @author Sean A. Irvine
 */
public class A192937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192937() {
    super(new long[] {100, -201, 102}, new long[] {100, 9999, 999898});
  }
}

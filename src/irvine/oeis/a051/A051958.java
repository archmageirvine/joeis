package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051958 <code>a(n) = 2 a(n-1) + 24 a(n-2), a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A051958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051958() {
    super(new long[] {24, 2}, new long[] {0, 1});
  }
}

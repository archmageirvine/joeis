package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106435 <code>a(n) = 3*a(n-1)+3*a(n-2), a(0)=0, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A106435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106435() {
    super(new long[] {3, 3}, new long[] {0, 3});
  }
}

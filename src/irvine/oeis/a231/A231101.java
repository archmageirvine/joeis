package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231101 <code>a(n)=3*a(n-3)+a(n-2), a(0)=3, a(1)=0, a(2)=2</code>.
 * @author Sean A. Irvine
 */
public class A231101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231101() {
    super(new long[] {3, 1, 0}, new long[] {3, 0, 2});
  }
}

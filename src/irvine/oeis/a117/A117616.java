package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117616 <code>a(0)=0, a(n)=4a(n-1)+2</code> for n odd, <code>a(n)=4a(n-1)</code> for n even.
 * @author Sean A. Irvine
 */
public class A117616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117616() {
    super(new long[] {-4, 1, 4}, new long[] {0, 2, 8});
  }
}

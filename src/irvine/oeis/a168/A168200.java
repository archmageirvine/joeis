package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168200 <code>a(n) = 3*n - a(n-1) + 1</code>, with <code>a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A168200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168200() {
    super(new long[] {-1, 1, 1}, new long[] {4, 3, 7});
  }
}

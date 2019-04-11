package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168373 <code>a(n) = 7*n - a(n-1) - 6</code> with <code>n&gt;1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A168373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168373() {
    super(new long[] {-1, 1, 1}, new long[] {4, 4, 11});
  }
}

package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168413 <code>a(n) = 9*n - a(n-1) - 5,</code> with <code>a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A168413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168413() {
    super(new long[] {-1, 1, 1}, new long[] {2, 11, 11});
  }
}

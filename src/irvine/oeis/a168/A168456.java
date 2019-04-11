package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168456 <code>a(n) = (10*n - 5*(-1)^n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168456() {
    super(new long[] {-1, 1, 1}, new long[] {8, 8, 18});
  }
}

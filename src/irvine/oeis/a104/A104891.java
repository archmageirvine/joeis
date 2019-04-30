package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104891 <code>a(0) = 0; a(n) = 5*a(n-1) + 5</code>.
 * @author Sean A. Irvine
 */
public class A104891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104891() {
    super(new long[] {-5, 6}, new long[] {0, 5});
  }
}

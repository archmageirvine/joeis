package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289796 <code>a(n) = (1/3)*A289795(n)</code>.
 * @author Sean A. Irvine
 */
public class A289796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289796() {
    super(new long[] {-1, 7, -3, 7}, new long[] {1, 8, 54, 361});
  }
}

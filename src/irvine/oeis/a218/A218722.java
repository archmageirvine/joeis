package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218722 <code>a(n) = (19^n-1)/18</code>.
 * @author Sean A. Irvine
 */
public class A218722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218722() {
    super(new long[] {-19, 20}, new long[] {0, 1});
  }
}

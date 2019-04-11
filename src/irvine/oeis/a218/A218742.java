package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218742 <code>a(n) = (39^n-1)/38</code>.
 * @author Sean A. Irvine
 */
public class A218742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218742() {
    super(new long[] {-39, 40}, new long[] {0, 1});
  }
}

package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175633 Numbers x such that <code>x^2 - 28*y^2 = 1</code> for some integer y.
 * @author Sean A. Irvine
 */
public class A175633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175633() {
    super(new long[] {-1, 254}, new long[] {1, 127});
  }
}

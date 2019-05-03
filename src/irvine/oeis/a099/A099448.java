package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099448 A Chebyshev transform of <code>A030191</code> associated to the knot <code>7_6</code>.
 * @author Sean A. Irvine
 */
public class A099448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099448() {
    super(new long[] {-1, 5, -7, 5}, new long[] {1, 5, 19, 65});
  }
}

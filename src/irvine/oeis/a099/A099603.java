package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099603 Row sums of triangle <code>A099602</code>, in which row n equals the inverse binomial transform of column n of the triangle of trinomial coefficients <code>(A027907)</code>.
 * @author Sean A. Irvine
 */
public class A099603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099603() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 2, 4, 12});
  }
}

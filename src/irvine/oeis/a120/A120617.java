package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120617 Hankel transform of g.f. 1/sqrt(1+4x^2).
 * @author Sean A. Irvine
 */
public class A120617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120617() {
    super(new long[] {-4, 0}, new long[] {1, -2});
  }
}

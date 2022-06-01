package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096382 Consider a Pythagorean triangle with sides a=u^2-v^2, b=2uv, c=u^2+v^2. The sequence is the area of the triangle when v=2, u=3,4,5,...
 * @author Sean A. Irvine
 */
public class A096382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096382() {
    super(new long[] {-1, 4, -6, 4}, new long[] {30, 96, 210, 384});
  }
}

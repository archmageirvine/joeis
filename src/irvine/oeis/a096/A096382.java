package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096382 Consider a Pythagorean triangle with sides <code>a=u^2-v^2, b=2uv, c=u^2+v^2</code>. The sequence is the area of the triangle when <code>v=2, u=3,4,5,..</code>.
 * @author Sean A. Irvine
 */
public class A096382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096382() {
    super(new long[] {-1, 4, -6, 4}, new long[] {30, 96, 210, 384});
  }
}

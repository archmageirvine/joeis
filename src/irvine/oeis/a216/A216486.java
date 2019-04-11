package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216486 <code>a(n)</code> is equal to the rational part (considering of the field Q(sqrt(13))) of the numbers A(n)/sqrt(13), where we have A(n) <code>= ((sqrt(13) -</code> 1)/2)*A(n-1) + A(n-2) + ((3-sqrt(13))/2)*A(n-3), with A(0) <code>= 6,</code> A(1) <code>= sqrt(13) - 1,</code> and A(2) <code>= 11 - sqrt(13)</code>.
 * @author Sean A. Irvine
 */
public class A216486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216486() {
    super(new long[] {1, -3, -6, 4, 5, -1}, new long[] {0, 1, -1, 4, -3, 14});
  }
}

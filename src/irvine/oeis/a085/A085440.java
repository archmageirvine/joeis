package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085440 <code>a(n) = Sum_{i=1..n} binomial(i+1,2)^5</code>.
 * @author Sean A. Irvine
 */
public class A085440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085440() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 244, 8020, 108020, 867395, 4951496, 22161864, 82628040, 267156165, 770440540, 2022773116, 4909947484L});
  }
}

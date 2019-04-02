package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073393 Sixth convolution of A002605(n) (generalized (2,2)-Fibonacci), n &gt;= 0, with itself.
 * @author Sean A. Irvine
 */
public class A073393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073393() {
    super(new long[] {128, 896, 2240, 1792, -1568, -2912, 336, 1920, -168, -728, 196, 112, -70, 14}, new long[] {1, 14, 126, 896, 5488, 30240, 153888, 735744, 3344544, 14581952, 61378240, 250693632, 997593856, 3880249856L});
  }
}

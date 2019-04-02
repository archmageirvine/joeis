package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085439 a(n) = Sum_{i=1..n} C(i+1,2)^4.
 * @author Sean A. Irvine
 */
public class A085439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085439() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 82, 1378, 11378, 62003, 256484, 871140, 2550756, 6651381, 15802006});
  }
}

package irvine.oeis.a359;

import irvine.math.z.Fibonacci;

/**
 * A359734.
 * @author Sean A. Irvine
 */
public class A359737 extends A359734 {

  /** Construct the sequence. */
  public A359737() {
    super(Fibonacci::fibonacci, 0);
  }
}

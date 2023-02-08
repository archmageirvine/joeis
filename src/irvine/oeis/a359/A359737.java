package irvine.oeis.a359;

import irvine.math.z.Fibonacci;

/**
 * A359737 Lexicographically earliest sequence of distinct nonnegative integers such that the sequence d(n) = A296239(a(n)) has the same sequence of digits, where A296239 gives the distance from the nearest Fibonacci number, cf. A000045.
 * @author Sean A. Irvine
 */
public class A359737 extends A359734 {

  /** Construct the sequence. */
  public A359737() {
    super(Fibonacci::fibonacci, 0);
  }
}

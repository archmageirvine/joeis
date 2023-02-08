package irvine.oeis.a359;

import irvine.math.z.Z;

/**
 * A359736 Lexicographically earliest sequence of distinct nonnegative integers such that the sequence d(n) = dist(a(n), SQUARES) has the same sequence of digits.
 * @author Sean A. Irvine
 */
public class A359736 extends A359734 {

  /** Construct the sequence. */
  public A359736() {
    super(k -> Z.valueOf(k).square(), 0);
  }
}

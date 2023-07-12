package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A056023 The positive integers written as a triangle, where row n is written from right to left if n is odd and otherwise from left to right.
 * (1) every positive integer occurs exactly once;
 * (2) row n consists of n consecutive numbers;
 * (3) odd-numbered rows are decreasing;
 * (4) even-numbered rows are increasing; and
 * (5) column 1 is increasing.
 * T(n, k) = (n^2 - (n - 2*k)*(-1)^(n mod 2))/2 + n mod 2.
 * @author Georg Fischer
 */
public class A056023 extends Triangle {

  /** Construct the sequence. */
  public A056023() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf((n * n - (n - 2 * k) * (((n & 1) == 0) ? 1 : -1)) / 2 + (n & 1));
  }
}

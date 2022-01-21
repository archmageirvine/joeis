package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A054240 Bit-interleaved number addition table; like binary addition but carries shift 2 instead of 1; addition base sqrt(2).
 * @author Georg Fischer
 */
public class A054240 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A054240() {
    super(0, 0, -1);
  }

  /**
   * Add two numbers in base sqrt(2).
   * From Haskell: a201651 n k = a054240 (n `xor` k) (shift (n .&amp;. k) 2); recursive.
   * @param x first number
   * @param y second number
   * @return x "+" y
   */
  public static long baseSqrt2Add(final long x, final long y) {
    return y == 0 ? x : baseSqrt2Add(x ^ y, (x & y) << 2);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(baseSqrt2Add(n, k));
  }
}

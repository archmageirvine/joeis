package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000573 Number of 4 X n normalized Latin rectangles.
 * @author Sean A. Irvine
 */
public class A000573 extends AbstractSequence {

  /** Construct the sequence. */
  public A000573() {
    super(4);
  }

  // Based on C code by Douglas Stones

  protected int mN = 3;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private boolean shouldNegate(final int[] a) {
    return ((a[2] + a[3] + a[5] + a[0]) & 1) == 1;
  }

  private int doyleF4x1(final int[] a) {
    return a[1] + a[2] + a[3] + a[4];
  }

  private int doyleF4x12(final int[] a) {
    return a[1] + a[2];
  }

  private int doyleF4x123(final int[] a) {
    return a[1];
  }

  private int doyleF4x13(final int[] a) {
    return a[1] + a[3];
  }

  private int doyleF4x2(final int[] a) {
    return a[1] + a[2] + a[5] + a[6];
  }

  private int doyleF4x23(final int[] a) {
    return a[1] + a[5];
  }

  private int doyleF4x3(final int[] a) {
    return a[1] + a[3] + a[5] + a[7];
  }

  private int doyleG4(final int[] a) {
    return doyleF4x1(a) * doyleF4x2(a) * doyleF4x3(a)
      - doyleF4x1(a) * doyleF4x23(a)
      - doyleF4x12(a) * doyleF4x3(a)
      + 2 * doyleF4x123(a)
      - doyleF4x13(a) * doyleF4x2(a);
  }

  @Override
  public Z next() {
    ++mN;
    final int[] a = new int[8];
    Z count = Z.ZERO;
    for (a[1] = 0; a[1] <= mN; a[1]++) {
      final int b1 = mN - a[1];
      for (a[2] = 0; a[2] <= b1; a[2]++) {
        final int b2 = b1 - a[2];
        for (a[3] = 0; a[3] <= b2; a[3]++) {
          final int b3 = b2 - a[3];
          for (a[4] = 0; a[4] <= b3; a[4]++) {
            final int b4 = b3 - a[4];
            for (a[5] = 0; a[5] <= b4; a[5]++) {
              final int b5 = b4 - a[5];
              for (a[6] = 0; a[6] <= b5; a[6]++) {
                final int b6 = b5 - a[6];
                for (a[7] = 0; a[7] <= b6; a[7]++) {
                  a[0] = b6 - a[7];
                  Z internal = mF.factorial(mN);
                  for (int x = 0; x <= 7; ++x) {
                    internal = internal.divide(mF.factorial(a[x]));
                  }
                  if (shouldNegate(a)) {
                    internal = internal.negate();
                  }
                  for (int x = 0; x <= 7; ++x) {
                    a[x]--;
                    final int d = doyleG4(a);
                    a[x]++;
                    internal = internal.multiply(Z.valueOf(d).pow(a[x]));
                  }
                  count = count.add(internal);
                }
              }
            }
          }
        }
      }
    }
    return count.divide(mN - 1).divide(mN - 2).divide(mN - 3);
  }
}

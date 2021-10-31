package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A144562 Triangle read by rows: T(n, k) = 2*n*k + n + k - 1.
 * @author Georg Fischer
 */
public class A144562 extends Triangle {
  protected long mNum1;
  protected long mNum2;

  /** Construct the sequence. */
  public A144562() {
    this(2, -1);
  }

  protected A144562(final long num1, final long num2) {
    mNum1 = num1;
    mNum2 = num2;
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(mNum1 * n * k + n + k + mNum2);
  }
}

package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A144562 Triangle read by rows: T(n, k) = 2*n*k + n + k - 1.
 * @author Georg Fischer
 */
public class A144562 extends BaseTriangle {

  protected long mNum1;
  protected long mNum2;

  /** Construct the sequence. */
  public A144562() {
    this(2, -1);
  }

  protected A144562(final long num1, final long num2) {
    super(1, 1, 1);
    hasRAM(true);
    mNum1 = num1;
    mNum2 = num2;
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(mNum1 * n * k + n + k + mNum2);
  }
}

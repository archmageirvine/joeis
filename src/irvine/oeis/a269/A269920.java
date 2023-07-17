package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A269920 Triangle read by rows: T(n,f) is the number of rooted maps with n edges and f faces on an orientable surface of genus 0.
 * @author Sean A. Irvine
 */
public class A269920 extends MemoryFunctionInt3Sequence<Z> {

  /** Construct the sequence. */
  public A269920() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A269920(final int offset) {
    super(offset);
  }

  @Override
  protected Z compute(final int n, final int g, final int f) {
    if (n < 0 || g < 0 || f < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return g == 0 && f == 1 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      final int l = n - k;
      assert l >= 1;
      final long k2 = 2L * k - 1;
      final long l2 = 2L * l - 1;
      for (int u = 1; u < f; ++u) {
        final int v = f - u;
        assert v >= 1;
        for (int i = 0; i <= g; ++i) {
          final int j = g - i;
          assert j >= 0;
          sum = sum.add(get(l - 1, j, v).multiply(get(k - 1, i, u)).multiply(k2).multiply(l2));
        }
      }
    }
    sum = sum.multiply(3);
    final long n2 = 2L * n - 1;
    sum = sum.add(get(n - 1, g, f).multiply(n2).multiply2());
    sum = sum.add(get(n - 1, g, f - 1).multiply(n2).multiply2());
    sum = sum.add(get(n - 2, g - 1, f).multiply(2L * n - 3).multiply(2L * n - 2).multiply(n2).divide2());
    return sum.divide(n + 1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 1;
    }
    return get(mN, 0, mM);
  }

}

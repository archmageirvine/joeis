package irvine.math.function;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * Number of partitions.
 * @author Sean A. Irvine
 */
class Partitions extends AbstractFunction1 {

  private final List<Z> mPartitions = new ArrayList<>();

  private void computeNext() {
    final int n = mPartitions.size();
    if (n <= 1) {
      mPartitions.add(Z.ONE);
      mPartitions.add(Z.ONE);
      return;
    }
    Z p = Z.ZERO;
    long k = 1;
    boolean sign = true;
    while (true) {
      final long delta = k * (3 * k - 1) / 2;
      if (n - delta < 0) {
        break;
      }
      p = p.signedAdd(sign, mPartitions.get(n - (int) delta));
      if (n - delta - k < 0) {
        break;
      }
      p = p.signedAdd(sign, mPartitions.get(n - (int) (delta + k)));
      ++k;
      sign = !sign;
    }
    mPartitions.add(p);
  }

  @Override
  public Z z(final int index) {
    if (index < 0) {
      return Z.ZERO;
    }
    while (mPartitions.size() <= index) {
      computeNext();
    }
    return mPartitions.get(index);
  }

  @Override
  public Z z(final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return z((int) n);
  }
}

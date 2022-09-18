package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A059252 Hilbert's Hamiltonian walk on N X N projected onto x axis: m(3).
 * @author Sean A. Irvine
 */
public class A059252 implements Sequence {

  private final DynamicIntArray mM = new DynamicIntArray();
  private final DynamicIntArray mM0 = new DynamicIntArray();
  private int mK = -1;
  private int mNextFreeM = 1;
  private int mNextFreeM0 = 1;
  private int mN = 0;

  protected int select(final int x, final int y) {
    return x;
  }

  @Override
  public Z next() {
    if (++mK >= mNextFreeM) {
      final int mlen = mNextFreeM;
      final int m0len = mNextFreeM0;
      if ((++mN & 1) == 0) {
        // m(2n) = m(2n - 1).f(m'(2n - 1), 2n - 1).f(m'(2n - 1), 2n - 1).mir(m(2n - 1));
        final int shift = 1 << (mN - 1);
        for (int k = 0; k < m0len; ++k) {
          mM.set(mNextFreeM++, mM0.get(k) + shift);
        }
        for (int k = 0; k < m0len; ++k) {
          mM.set(mNextFreeM++, mM0.get(k) + shift);
        }
        for (int k = mlen - 1; k >= 0; --k) {
          mM.set(mNextFreeM++, mM.get(k));
        }
        // m'(2n) = m'(2n - 1).m(2n - 1).f(m(2n - 1), 2n - 1).c(m'(2n - 1), 2n);
        for (int k = 0; k < mlen; ++k) {
          mM0.set(mNextFreeM0++, mM.get(k));
        }
        for (int k = 0; k < mlen; ++k) {
          mM0.set(mNextFreeM0++, mM.get(k) + shift);
        }
        final int s2 = (1 << mN) - 1;
        for (int k = 0; k < m0len; ++k) {
          mM0.set(mNextFreeM0++, s2 - mM0.get(k));
        }
      } else {
        final int shift = 1 << (mN - 1);
        // m(2n + 1) = m(2n).m'(2n).f(m'(2n), 2n).c(m(2n), 2n + 1);
        for (int k = 0; k < m0len; ++k) {
          mM.set(mNextFreeM++, mM0.get(k));
        }
        for (int k = 0; k < m0len; ++k) {
          mM.set(mNextFreeM++, mM0.get(k) + shift);
        }
        final int s2 = (1 << mN) - 1;
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, s2 - mM.get(k));
        }
        // m'(2n + 1) = m'(2n).f(m(2n), 2n).f(m(2n), 2n).mir(m'(2n));
        for (int k = 0; k < mlen; ++k) {
          mM0.set(mNextFreeM0++, mM.get(k) + shift);
        }
        for (int k = 0; k < mlen; ++k) {
          mM0.set(mNextFreeM0++, mM.get(k) + shift);
        }
        for (int k = m0len - 1; k >= 0; --k) {
          mM0.set(mNextFreeM0++, mM0.get(k));
        }
      }
    }
    return Z.valueOf(select(mM.get(mK), mM0.get(mK)));
  }
}

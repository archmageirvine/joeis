package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A059261 Hilbert's Hamiltonian walk on N X N projected onto the first diagonal: M(3) (sum of the sequences A059252 and A059253).
 * @author Sean A. Irvine
 */
public class A059261 implements Sequence {

  private final DynamicIntArray mM = new DynamicIntArray();
  private int mK = -1;
  private int mNextFreeM = 1;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mK >= mNextFreeM) {
      ++mN;
      final int mlen = mNextFreeM;
      // M(n+1)=M(n).f(M(n), n).f(M(n), n+1).d(M(n), n)
      int shift = 1 << (mN - 1);
      for (int k = 0; k < mlen; ++k) {
        mM.set(mNextFreeM++, mM.get(k) + shift);
      }
      shift <<= 1;
      for (int k = 0; k < mlen; ++k) {
        mM.set(mNextFreeM++, mM.get(k) + shift);
      }
      final int s2 = (3 << (mN - 1)) - 2;
      for (int k = 0; k < mlen; ++k) {
        mM.set(mNextFreeM++, s2 - mM.get(k));
      }
    }
    return Z.valueOf(mM.get(mK));
  }
}

package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A059285 Hilbert's Hamiltonian walk projected onto the second diagonal: M'(3) (difference between sequences A059253 and A059252; their sum is A059261).
 * @author Sean A. Irvine
 */
public class A059285 extends Sequence0 {

  private final DynamicIntArray mM = new DynamicIntArray();
  private int mK = -1;
  private int mNextFreeM = 1;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mK >= mNextFreeM) {
      final int mlen = mNextFreeM;
      final int shift = 1 << mN;
      if ((++mN & 1) == 0) {
        // M'(2n)=M'(2n-1). (-f(-M'(2n-1), 2n-1)).(-M'(2n-1)).f(M'(2n-1), 2n-1),
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, -(shift + mM.get(k)));
        }
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, -mM.get(k));
        }
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, shift - mM.get(k));
        }
      } else {
        // M'(2n+1)=M'(2n).f(M'(2n), 2n).(-M'(2n)).(-(f(-M'(2n), 2n+1)).
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, shift - mM.get(k));
        }
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, -mM.get(k));
        }
        for (int k = 0; k < mlen; ++k) {
          mM.set(mNextFreeM++, -(shift + mM.get(k)));
        }
      }
    }
    return Z.valueOf(mM.get(mK));
  }
}

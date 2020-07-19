package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033819 Trimorphic numbers: <code>n^3</code> ends with <code>n</code>. Also m-morphic numbers for all m <code>&gt; 5</code> such that <code>m-1</code> is not divisible by 10 and m <code>== 3 (mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A033819 implements Sequence {

  private long mMod = 10;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      if (Z.valueOf(mN).pow(3).mod(mMod) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

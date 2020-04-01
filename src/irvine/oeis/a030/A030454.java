package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030454.
 * @author Sean A. Irvine
 */
public class A030454 implements Sequence {

  // WARNING: Do not use this to extend this sequence.  The computation of odd values of
  // the zeta function here are not guaranteed to be correct beyond some uncertain point.

  private final ArrayList<CR> mZetaList = new ArrayList<>();
  {
    mZetaList.add(null); // placeholder for zeta(0)
    mZetaList.add(null); // placeholder for zeta(1)
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    long c = 0;
    while (true) {
      if (++m >= mZetaList.size()) {
        mZetaList.add(Zeta.zeta(m).subtract(CR.ONE));
      }
      final Z scaled = mZetaList.get(m).shiftLeft(mN).floor();
      if (Z.ZERO.equals(scaled)) {
        break; // We will never see another 1 in this column
      }
      if (!scaled.isEven()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

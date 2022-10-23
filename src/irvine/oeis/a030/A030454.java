package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030454 Make a table giving binary expansion of zeta(m) for m = 2, 3, ...; a(n) = number of 1's in n-th column of table (after decimal point).
 * @author Sean A. Irvine
 */
public class A030454 extends Sequence1 {

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
      if (scaled.isZero()) {
        break; // We will never see another 1 in this column
      }
      if (scaled.isOdd()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

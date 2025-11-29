package irvine.oeis.a390;

import java.util.ArrayList;

import irvine.math.ContinuedFractionUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a084.A084580;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390737 a(n) is the number of reliable digits produced by using n terms of A084580 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A390737 extends A084580 {

  private final ArrayList<Z> mCf = new ArrayList<>();
  {
    mCf.add(Z.ZERO);
  }

  @Override
  public Z next() {
    mCf.add(super.next());
    final Sequence cLo = new DecimalExpansionSequence(CR.valueOf(ContinuedFractionUtils.toQ(mCf)));
    mCf.add(Z.ONE);
    final Sequence cHi = new DecimalExpansionSequence(CR.valueOf(ContinuedFractionUtils.toQ(mCf)));
    mCf.remove(mCf.size() - 1);
    long cnt = 0;
    while (true) {
      final Z lo = cLo.next();
      final Z hi = cHi.next();
      if (!lo.equals(hi)) {
        return Z.valueOf(cnt);
      }
      ++cnt;
    }
  }
}

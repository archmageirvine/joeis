package irvine.oeis.a391;

import java.util.ArrayList;

import irvine.math.ContinuedFractionUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392060 Number of decimal places which are known after n terms of the continued fraction for the golden ratio.
 * @author Sean A. Irvine
 */
public class A391285 extends Sequence1 {

  private final ArrayList<Z> mCf = new ArrayList<>();

  @Override
  public Z next() {
    mCf.add(Z.TWO);
    final Sequence cLo = new DecimalExpansionSequence(CR.valueOf(ContinuedFractionUtils.toQ(mCf)));
    mCf.add(Z.ONE);
    final Sequence cHi = new DecimalExpansionSequence(CR.valueOf(ContinuedFractionUtils.toQ(mCf)));
    mCf.remove(mCf.size() - 1);
    long cnt = 0;
    while (cHi.next().equals(cLo.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

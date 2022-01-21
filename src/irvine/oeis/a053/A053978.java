package irvine.oeis.a053;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A053978.
 * @author Sean A. Irvine
 */
public class A053978 implements Sequence {

  private int mN = -1;
  private final ArrayList<CR> mR = new ArrayList<>();
  {
    mR.add(CR.ONE);
    next();
  }

  private CR fromContinuedFraction() {
    CR value = mR.get(mR.size() - 1);
    for (int k = mR.size() - 2; k >= 0; --k) {
      value = value.inverse().add(mR.get(k));
    }
    return value;
  }

  @Override
  public Z next() {
    ++mN;
    mR.add(fromContinuedFraction());
    mR.add(fromContinuedFraction());
    final int n = mR.size();
    final ContinuedFractionSequence cfrac = new ContinuedFractionSequence(new DecimalExpansionSequence(mR.get(n - 1)));
    for (int k = 1; k < mN; ++k) {
      cfrac.next();
    }
    return cfrac.next();
  }
}

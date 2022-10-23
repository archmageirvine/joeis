package irvine.oeis.a053;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A053978 Continued fraction expansion of limit_{m-&gt;infinity} [r_m], where r_1=1, r_{m+1}= r_1 + 1/(r_2 + 1/(r_3 +...1/(r_{m-1} + 1/r_m)...)).
 * @author Sean A. Irvine
 */
public class A053978 extends Sequence0 {

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

package irvine.oeis.a395;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395629 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A395629 extends Sequence1 {

  private final ArrayList<Sequence> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      final int n = mA.size() + 1;
      CR prod = CR.ONE;
      for (long k = 1; k <= n; ++k) {
        prod = prod.multiply(CR.valueOf(k + 1).sqrt().subtract(CR.valueOf(k).sqrt()));
      }
      mA.add(new ContinuedFractionSequence(new DecimalExpansionSequence(prod)).skip());
      mM = 0;
    }
    return mA.get(mM).next();
  }
}

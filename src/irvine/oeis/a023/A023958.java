package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A023958 n-th digit in the decimal expansion of the n-th root of n.
 * @author Sean A. Irvine
 */
public class A023958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR a = CR.valueOf(++mN);
    final Sequence s = new DecimalExpansionSequence(ComputableReals.SINGLETON.pow(a, a.inverse()));
    for (int k = 1; k < mN; ++k) {
      s.next();
    }
    return s.next();
  }
}

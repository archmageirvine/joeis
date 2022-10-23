package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A023959 n-th binary digit in fractional part of n-th root of n.
 * @author Sean A. Irvine
 */
public class A023959 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR a = CR.valueOf(++mN);
    final CR b = ComputableReals.SINGLETON.pow(a, a.inverse());
    final Sequence s = new DecimalExpansionSequence(0, b, 2);
    for (int k = 0; k < mN; ++k) {
      s.next();
    }
    return s.next();
  }
}

package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;

/**
 * A023957 n-th digit after the decimal point of the n-th root of n.
 * @author Sean A. Irvine
 */
public class A023957 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR a = CR.valueOf(++mN);
    final Sequence s = new DecimalExpansionSequence(ComputableReals.SINGLETON.pow(a, a.inverse()));
    for (int k = 0; k < mN; ++k) {
      s.next();
    }
    return s.next();
  }
}

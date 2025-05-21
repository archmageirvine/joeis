package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077427 Primitive period length of (regular) continued fraction of (sqrt(D(n))+1)/2 for D(n)=A077425(n).
 * @author Sean A. Irvine
 */
public class A077427 extends A077425 {

  @Override
  public Z next() {
    final Z t = super.next();
    final ContinuedFractionSequence cf = new ContinuedFractionSequence(new DecimalExpansionSequence(CR.valueOf(t).sqrt().add(1).divide(2)));
    final Z b0e = cf.next().multiply2().subtract(1);
    long cnt = 1;
    while (!cf.next().equals(b0e)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

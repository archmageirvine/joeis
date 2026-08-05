package irvine.oeis.a226;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a112.A112141;

/**
 * A226525 Fortunate semiprimes: least m &gt; 1 such that m + sp(n)# is semiprime, where sp# denotes the product of the semiprimes &lt;= sp.
 * @author Sean A. Irvine
 */
public class A226525 extends Sequence1 {

  private final Sequence mA = new A112141();

  @Override
  public Z next() {
    final Z t = mA.next();
    long k = 1;
    while (!Predicates.SEMIPRIME.is(t.add(++k))) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}

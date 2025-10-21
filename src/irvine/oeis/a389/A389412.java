package irvine.oeis.a389;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005117;

/**
 * A389412 Length k of the series {(A005117(n) - 1) + A005117(i)} such that every number (A005117(n) - 1) + A005117(i) is squarefree, for n &gt;= 2 and 1 &lt;= i &lt;= k.
 * @author Sean A. Irvine
 */
public class A389412 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A005117());
  private int mN = 1;

  @Override
  public Z next() {
    final Z t = mA.a(++mN).subtract(1);
    int cnt = 1;
    while (Predicates.SQUARE_FREE.is(t.add(mA.a(cnt)))) {
      ++cnt;
    }
    return Z.valueOf(cnt - 1);
  }
}

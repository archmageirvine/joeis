package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076543 a(n) = Sum_{k=1..n} k*sqf(k) where sqf(k)=1 if k is squarefree and sqf(k)=-1 otherwise.
 * @author Sean A. Irvine
 */
public class A076543 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.signedAdd(Predicates.SQUARE_FREE.is(++mN), Z.valueOf(mN));
    return mSum;
  }
}

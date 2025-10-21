package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A389645 The factorial base expansion of A389644(n), when read backwards, corresponds to that of A389644(a(n)).
 * @author Sean A. Irvine
 */
public class A389645 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A389644());
  private int mN = -1;

  @Override
  public Z next() {
    final ArrayList<Z> f = ZUtils.factorialBaseList(mA.a(++mN));
    Z sum = Z.ZERO;
    for (int k = 0; k < f.size(); ++k) {
      sum = sum.add(f.get(k).multiply(Functions.FACTORIAL.z(k + 1)));
    }
    int m = 0;
    while (!mA.a(m).equals(sum)) {
      ++m;
    }
    return Z.valueOf(m + 1); // +1 because my indexing was from 0
  }
}

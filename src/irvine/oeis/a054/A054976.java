package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002724;
import irvine.oeis.a002.A002725;

/**
 * A054976 Number of binary n X n matrices with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A054976 extends A002724 {

  private final Sequence mA2725 = new A002725();
  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).subtract(mA2725.next().multiply2());
  }
}


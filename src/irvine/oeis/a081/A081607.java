package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007089;

/**
 * A081607 Number of numbers &lt;= n having at least one 0 in their ternary representation.
 * @author Sean A. Irvine
 */
public class A081607 extends Sequence0 {

  private final Sequence mA = new A007089();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if ((Functions.SYNDROME.i(mA.next()) & 1) == 1) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

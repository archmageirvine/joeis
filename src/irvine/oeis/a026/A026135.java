package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a025.A025179;

/**
 * A026135 Number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also sum of numbers in row n+1 of the array T defined in A026120.
 * @author Sean A. Irvine
 */
public class A026135 extends Sequence0 {

  private final Sequence mS = new PrependSequence(new A025179(), 1);
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.add(t);
  }
}

package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A082608 Squares pertaining to A082607. a(n) = A082607(n)*A082607(n+1)- 1.
 * @author Sean A. Irvine
 */
public class A082608 extends Sequence1 {

  private final Sequence mS = new A082607();
  private Z mA = mS.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.multiply(t).subtract(1);
  }
}

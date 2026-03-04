package irvine.oeis.a206;

import irvine.math.z.Z;
import irvine.oeis.a002.A002496;

/**
 * A206400 Number of composites of the form n^2 + 1 between two successive primes of this form.
 * @author Sean A. Irvine
 */
public class A206400 extends A002496 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(2).sqrt().subtract(t.subtract(1).sqrt());
  }
}

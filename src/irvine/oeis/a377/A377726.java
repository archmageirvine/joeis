package irvine.oeis.a377;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002315;

/**
 * A377726 Table read by rows: row n is the unique primitive Pythagorean triple (a,b,c) such that (a-b+c)/2 is A002315(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A377726 extends Sequence1 {

  private final Sequence mA = new A002315().skip();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.subtract(1).multiply(t).multiply2();
  }
}

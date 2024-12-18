package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a004.A004490;

/**
 * A073751 Prime numbers that when multiplied in order yield the sequence of colossally abundant numbers A004490.
 * @author Sean A. Irvine
 */
public class A073751 extends A004490 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

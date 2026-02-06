package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083572 Smaller of two consecutive star numbers (A000567) whose sum is a square.
 * @author Sean A. Irvine
 */
public class A083572 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mX1 = Z.ZERO;
  private Z mY1 = Z.ONE;
  private Z mX2 = Z.ONE;
  private Z mY2 = Z.THREE;

  @Override
  public Z next() {
    mA.add(mX1.multiply(mX1.multiply(3).subtract(2)));
    mA.add(mX2.multiply(mX2.multiply(3).subtract(2)));
    final Z t1 = mX1.multiply(49).add(mY1.multiply(20)).add(8);
    mY1 = mX1.multiply(120).add(mY1.multiply(49)).add(20);
    mX1 = t1;
    final Z t2 = mX2.multiply(49).add(mY2.multiply(20)).add(8);
    mY2 = mX2.multiply(120).add(mY2.multiply(49)).add(20);
    mX2 = t2;
    return mA.pollFirst();
  }
}

package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001240 Expansion of <code>1/((1-2x)(1-3x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A001240 implements Sequence {

  private Z mTwo = Z.ONE;
  private Z mThree = Z.THREE;

  @Override
  public Z next() {
    final Z t = mTwo.add(mThree.multiply(mTwo.subtract(1)));
    mTwo = mTwo.multiply2();
    mThree = mThree.multiply(3);
    return t;
  }
}

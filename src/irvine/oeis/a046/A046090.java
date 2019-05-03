package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046090 Consider all Pythagorean triples <code>(X,X+1,Z)</code> ordered by increasing Z; sequence gives <code>X+1</code> values.
 * @author Sean A. Irvine
 */
public class A046090 implements Sequence {

  private Z mA = Z.valueOf(-3);
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA).subtract(2);
    mA = mB;
    mB = t;
    return t;
  }
}

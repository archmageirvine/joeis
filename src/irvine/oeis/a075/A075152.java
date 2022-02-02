package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A075152 Number of possible permutations of a Rubik cube of size n X n X n.
 * @author Sean A. Irvine
 */
public class A075152 implements Sequence {

  private static final Z C1 = Z.valueOf(3246670537110000L);
  private Z mA = Z.valueOf(3674160);
  private Z mB = new Z("43252003274489856000");
  protected int mN = 0;

  @Override
  public Z next() {
    switch (++mN) {
      case 1:
        return Z.ONE;
      case 2:
        return mA;
      case 3:
        return mB;
      default:
        final Z t = mA.multiply(191102976).multiply(C1.pow(mN - 2));
        mA = mB;
        mB = t;
        return mB;
    }
  }
}

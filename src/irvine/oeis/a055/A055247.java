package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055247 Related to A055246 and A005836. Used for boundaries of open intervals which have to be erased in the Cantor middle third set construction.
 * @author Georg Fischer
 */
public class A055247 extends A055246 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      mA = super.next();
      return mA;
    } else {
      return mA.add(1);
    }
  }
}

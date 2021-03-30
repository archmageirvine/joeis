package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045957 Twin even-lucky-numbers: middle terms.
 * @author Sean A. Irvine
 */
public class A045957 extends A045954 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.TWO.equals(mA.subtract(t))) {
        return t.add(1);
      }
    }
  }
}

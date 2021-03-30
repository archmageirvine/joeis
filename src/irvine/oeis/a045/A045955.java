package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045955 Twin Even-Lucky-Numbers: lower terms.
 * @author Sean A. Irvine
 */
public class A045955 extends A045954 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.TWO.equals(mA.subtract(t))) {
        return t;
      }
    }
  }
}

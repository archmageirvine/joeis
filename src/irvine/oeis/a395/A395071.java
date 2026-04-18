package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a010.A010342;

/**
 * A395071 allocated for Asher Shmidov.
 * @author Sean A. Irvine
 */
public class A395071 extends A010342 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}

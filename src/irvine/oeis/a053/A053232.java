package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053232 extends A053230 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027653 Values of Zagier's function <code>J_1(k)</code> as k runs through the numbers <code>-1, 0, 3, 4, 7, 8</code>, ... which are <code>== -1</code> or <code>0 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A027653 extends A027652 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((mN & 3) <= 1) {
        return t;
      }
    }
  }
}

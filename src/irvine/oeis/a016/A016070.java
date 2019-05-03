package irvine.oeis.a016;

import irvine.math.z.Z;

/**
 * A016070 Numbers n such that <code>n^2</code> contains exactly 2 different digits, excluding <code>10^m, 2*10^m, 3*10^m</code>.
 * @author Sean A. Irvine
 */
public class A016070 extends A016069 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.toString().matches("[123]0+")) {
        return t;
      }
    }
  }
}

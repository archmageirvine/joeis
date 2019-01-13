package irvine.oeis.a016;

import irvine.math.z.Z;

/**
 * A016069.
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

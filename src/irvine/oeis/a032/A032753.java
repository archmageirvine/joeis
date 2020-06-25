package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032753 Palindromic <code>Super-5</code> Numbers.
 * @author Sean A. Irvine
 */
public class A032753 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.pow(5).multiply(5).toString().contains("55555")) {
        return p;
      }
    }
  }
}

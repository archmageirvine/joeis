package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059470 Numbers that are the products of distinct substrings (&gt;1) of themselves and do not end in 0.
 * @author Sean A. Irvine
 */
public class A059470 extends A059469 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        return t;
      }
    }
  }
}

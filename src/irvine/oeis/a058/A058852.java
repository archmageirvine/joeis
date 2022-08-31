package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A058852 Palindromes n such that n and n^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A058852 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ZUtils.digitSum(t) == ZUtils.digitSum(t.square())) {
        return t;
      }
    }
  }
}

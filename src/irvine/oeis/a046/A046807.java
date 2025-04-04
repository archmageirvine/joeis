package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.CollectionUtils;

/**
 * A046807 Palindromes in factorial base.
 * @author Sean A. Irvine
 */
public class A046807 extends Sequence1 {

  private long mM = -1;

  @Override
  public Z next() {
    while (true) {
      if (CollectionUtils.isPalindrome(ZUtils.factorialBaseList(Z.valueOf(++mM)))) {
        return Z.valueOf(mM);
      }
    }
  }
}

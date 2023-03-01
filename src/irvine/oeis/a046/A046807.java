package irvine.oeis.a046;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a007.A007623;
import irvine.util.CollectionUtils;

/**
 * A046807 Palindromes in factorial base.
 * @author Sean A. Irvine
 */
public class A046807 extends A007623 {

  private long mM = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final List<Z> t = factorialBase(Z.valueOf(mM));
      if (CollectionUtils.isPalindrome(t)) {
        return Z.valueOf(mM);
      }
    }
  }
}

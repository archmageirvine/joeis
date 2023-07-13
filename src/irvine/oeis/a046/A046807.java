package irvine.oeis.a046;

import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
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
      ++mM;
      final List<Z> t = MemoryFactorial.SINGLETON.factorialBaseList(Z.valueOf(mM));
      if (CollectionUtils.isPalindrome(t)) {
        return Z.valueOf(mM);
      }
    }
  }
}

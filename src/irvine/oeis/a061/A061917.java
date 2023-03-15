package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A061917 Either a palindrome or becomes a palindrome if trailing 0's are omitted.
 * @author Sean A. Irvine
 */
public class A061917 extends A002113 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    // Prime tree to avoid isEmpty() checking later
    mA.add(super.next()); // 0
    mA.add(super.next()); // 1
  }
  private Z mNext = super.next();

  @Override
  public Z next() {
    if (mNext.compareTo(mA.first()) < 0) {
      mA.add(mNext);
      mNext = super.next();
    }
    final Z res = mA.pollFirst();
    if (!res.isZero()) {
      mA.add(res.multiply(10));
    }
    return res;
  }
}


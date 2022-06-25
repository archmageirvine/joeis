package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057719 Prime factors of numbers in A006521 (numbers k that divide 2^k + 1).
 * @author Sean A. Irvine
 */
public class A057719 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();

  private boolean is(final Z ord) {
    if (ord.isOdd()) {
      return false;
    }
    for (final Z p : Jaguar.factor(ord.divide2()).toZArray()) {
      if (!mA.contains(p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z ord = new IntegersModMul(p).order(Z.TWO);
      if (is(ord)) {
        mA.add(p);
        return p;
      }
    }
  }
}

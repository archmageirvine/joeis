package irvine.oeis.a060;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060301 For n&gt;3: a(n) is a multiple of three distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A060301 extends Sequence1 {

  private final HashSet<Z> mT = new HashSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      switch (mT.size()) {
        case 0:
          mT.add(Z.TWO);
          return Z.TWO;
        case 1:
          mT.add(Z.THREE);
          return Z.THREE;
        default:
          mT.add(Z.FIVE);
          mA.add(Z.valueOf(30));
          return Z.FIVE;
      }
    }
    final Z res = mA.pollFirst();
    for (final Z a : mT) {
      final Z m = res.multiply(a);
      for (final Z b : mT) {
        if (a.equals(b)) {
          break;
        }
        mA.add(m.multiply(b));
      }
    }
    mT.add(res);
    return res;
  }
}

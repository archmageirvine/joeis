package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064896 Numbers of the form (2^(m*r)-1)/(2^r-1) for positive integers m, r.
 * @author Sean A. Irvine
 */
public class A064896 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mNext = Z.SEVEN;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.THREE);
      return Z.ONE;
    }
    while (mA.first().compareTo(mNext) > 0) {
      mA.add(mNext);
      mNext = mNext.multiply2().add(1); // mNext = 111... in binary
    }
    final Z res = mA.pollFirst();
    final String s = res.toString(2);
    Z t = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      t = t.multiply2();
      if (s.charAt(k) == '1') {
        t = t.multiply2().add(1);
      }
    }
    mA.add(t);
    return res;
  }
}


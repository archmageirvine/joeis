package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073925 Powers of 2 rearranged such that every partial sum (n&gt;1) is composite.
 * @author Sean A. Irvine
 */
public class A073925 extends Sequence1 {

  private final HashSet<Integer> mUsed = new HashSet<>();
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    int k = 0;
    while (true) {
      if (!mUsed.contains(++k)) {
        final Z t = mSum.setBit(k);
        if (!t.isProbablePrime()) {
          mSum = t;
          mUsed.add(k);
          return Z.ONE.shiftLeft(k);
        }
      }
    }
  }
}


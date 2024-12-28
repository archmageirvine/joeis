package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073923 a(1)=1, a(n) is the smallest power of 2 not included earlier such that sum(k=1,n,a(n)) is prime.
 * @author Sean A. Irvine
 */
public class A073923 extends Sequence1 {

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
        if (t.isProbablePrime()) {
          mSum = t;
          mUsed.add(k);
          return Z.ONE.shiftLeft(k);
        }
      }
    }
  }
}


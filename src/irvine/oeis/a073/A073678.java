package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073678 Lexically least rearrangement of natural numbers such that the least common multiple of the first n terms, plus one, is prime.
 * @author Sean A. Irvine
 */
public class A073678 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      final Z t = Functions.LCM.z(mLcm, ++k);
      if (!mUsed.contains(k) && t.add(1).isProbablePrime()) {
        mUsed.add(k);
        mLcm = t;
        return Z.valueOf(k);
      }
    }
  }
}

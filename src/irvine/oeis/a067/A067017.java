package irvine.oeis.a067;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067017 Start with a(0)=1, a(1)=4, a(2)=3, a(3)=2; for n&gt;=3, a(n+1) = mex_i (a(i)+a(n-i)), where mex means smallest nonnegative missing number.
 * @author Sean A. Irvine
 */
public class A067017 extends CachedSequence {

  private static final Z[] SMALL = {Z.ONE, Z.FOUR, Z.THREE, Z.TWO};

  /** Construct the sequence. */
  public A067017() {
    super(0, Integer.class, (self, k) -> {
      if (k < SMALL.length) {
        return SMALL[k];
      }
      final Set<Long> seen = new HashSet<>();
      for (int j = 0; j < k; ++j) {
        seen.add(self.a(j).add(self.a(k - j - 1)).longValueExact());
      }
      return Z.valueOf(LongUtils.mex(seen));
    });
  }
}

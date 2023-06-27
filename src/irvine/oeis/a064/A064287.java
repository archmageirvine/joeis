package irvine.oeis.a064;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064287 Number of cyclotomic cosets C of 2 mod 2n+1 such that -C is not equal to C, divided by 2.
 * @author Sean A. Irvine
 */
public class A064287 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long mod = 2 * ++mN + 1;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    long cnt = 0;
    for (long s = 1; s < mod; ++s) {
      if (!seen.isSet(s)) {
        final Set<Long> coset = new HashSet<>();
        while (!seen.isSet(s)) {
          coset.add(s);
          seen.set(s);
          s *= 2;
          s %= mod;
        }
        if (!A064286.isSelfComplement(mod, coset)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt / 2);
  }
}

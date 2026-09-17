package irvine.oeis.a086;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014137;
import irvine.oeis.a085.A085169;

/**
 * A086587 Least common multiple of cycle sizes in range [A014137(n-1)..A014138(n-1)] of permutations A085169/A085170.
 * @author Sean A. Irvine
 */
public class A086587 extends Sequence0 {

  private final Sequence mHi = new A014137();
  private final Sequence mS = new A085169();
  private long mM = 0;

  @Override
  public Z next() {
    final long end = mHi.next().longValueExact();
    final HashMap<Long, Long> m = new HashMap<>();
    while (mM < end) {
      m.put(mM, mS.next().longValueExact());
      ++mM;
    }
    Z lcm = Z.ONE;
    final HashSet<Long> seen = new HashSet<>();
    for (final Map.Entry<Long, Long> e : m.entrySet()) {
      final long k = e.getKey();
      if (seen.add(k)) {
        long len = 1;
        long v = e.getValue();
        while (seen.add(v)) {
          ++len;
          v = m.get(v);
        }
        lcm = lcm.lcm(len);
      }
    }
    return lcm;
  }
}

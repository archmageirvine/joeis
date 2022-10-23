package irvine.oeis.a007;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007865 Number of sum-free subsets of {1, ..., n}.
 * @author Sean A. Irvine
 */
public class A007865 extends Sequence0 {

  private Set<Set<Integer>> mS = Collections.singleton(Collections.emptySet());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Set<Set<Integer>> next = new HashSet<>(mS);
      for (final Set<Integer> s : mS) {
        final Set<Integer> cs = new HashSet<>(s);
        cs.add(mN);
        boolean ok = true;
        for (final int v : cs) {
          if (cs.contains(mN - v)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          next.add(cs);
        }
      }
      mS = next;
    }
    return Z.valueOf(mS.size());
  }
}

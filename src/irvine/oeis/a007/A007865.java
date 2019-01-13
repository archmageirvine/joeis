package irvine.oeis.a007;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007865.
 * @author Sean A. Irvine
 */
public class A007865 implements Sequence {

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

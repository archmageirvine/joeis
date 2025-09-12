package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057117;

/**
 * A080311 Orbit size of each tree encoded by A014486(n) under Meeussen's bf&lt;-&gt;df map on binary trees.
 * @author Sean A. Irvine
 */
public class A080311 extends A014486 {

  @Override
  public Z next() {
    final Z t = super.next();
    long cnt = 0;
    Z m = t;
    do {
      ++cnt;
      m = A057117.bfsToDfs(m);
    } while (!m.equals(t));
    return Z.valueOf(cnt);
  }
}

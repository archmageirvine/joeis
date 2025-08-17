package irvine.oeis.a385;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a384.A384311;

/**
 * A384311 a(n) is the number of ways to partition an n X n X n cube into 4 noncongruent cuboids.
 * @author Sean A. Irvine
 */
public class A385580 extends A384311 {

  @Override
  protected boolean accept(final List<OrderedTriple> lst) {
    for (final OrderedTriple t : lst) {
      final Z v = t.volume();
      for (final OrderedTriple u : lst) {
        if (u == t) {
          break;
        }
        if (u.volume().equals(v)) {
          return false;
        }
      }
    }
    return true;
  }
}


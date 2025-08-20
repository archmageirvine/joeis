package irvine.oeis.a385;

import java.util.List;

import irvine.oeis.a384.A384311;

/**
 * A385580 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A385580 extends A384311 {

  @Override
  protected boolean accept(final List<Cuboid> lst) {
    for (final Cuboid t : lst) {
      final int v = t.getVolume();
      for (final Cuboid u : lst) {
        if (u == t) {
          break;
        }
        if (u.getVolume() == v) {
          return false;
        }
      }
    }
    return true;
  }
}


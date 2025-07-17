package irvine.oeis.a385;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a381.A381847;

/**
 * A385151 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A385151 extends A381847 {

  protected A385151(final int offset, final int cuboids) {
    super(offset, cuboids);
  }

  /** Construct the sequence. */
  public A385151() {
    super(3, 3);
  }

  @Override
  protected Z process(final Set<List<OrderedTriple>> triples) {
    Z minDefect = null;
    for (final List<OrderedTriple> t : triples) {
      if (new TreeSet<>(t).size() == mCuboids) {
        Z min = null;
        Z max = Z.ZERO;
        for (final OrderedTriple cuboid : t) {
          final Z vol = cuboid.volume();
          min = min == null ? vol : min.min(vol);
          max = max.max(vol);
        }
        final Z defect = max.subtract(min);
        if (minDefect == null || defect.compareTo(minDefect) < 0) {
          minDefect = defect;
        }
      }
    }
    return minDefect == null ? Z.ZERO : minDefect;
  }
}


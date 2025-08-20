package irvine.oeis.a385;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a381.A381847;

/**
 * A385151 a(n) is the least possible difference between the largest and smallest volumes of distinct three-cuboid combination filling an n X n X n cube.
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
  protected Z process(final Set<List<Cuboid>> triples, final int cuboids) {
    int minDefect = Integer.MAX_VALUE;
    for (final List<Cuboid> t : triples) {
      if (new TreeSet<>(t).size() == mCuboids) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (final Cuboid cuboid : t) {
          final int vol = cuboid.getVolume();
          min = Math.min(min, vol);
          max = Math.max(max, vol);
        }
        final int defect = max - min;
        minDefect = Math.min(minDefect, defect);
      }
    }
    return Z.valueOf(minDefect == Integer.MAX_VALUE ? 0 : minDefect);
  }
}


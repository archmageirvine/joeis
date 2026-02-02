package irvine.oeis.a392;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a381.A381847;

/**
 * A392885 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A392885 extends A381847 {

  protected A392885(final int offset, final int cuboids) {
    super(offset, cuboids);
  }

  /** Construct the sequence. */
  public A392885() {
    super(3, 4);
  }

  @Override
  protected Z process(final Set<List<Cuboid>> triples, final int cuboids) {
    int maxSurface = 0;
    for (final List<Cuboid> t : triples) {
      if (new TreeSet<>(t).size() == mCuboids) {
        int surface = 0;
        for (final Cuboid cuboid : t) {
          final int s = cuboid.getSurface();
          surface += s;
        }
        maxSurface = Math.max(maxSurface, surface);
      }
    }
    return Z.valueOf(maxSurface);
  }
}


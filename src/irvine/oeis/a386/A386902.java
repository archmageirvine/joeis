package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * A386756 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386902 extends A386296 {

  private int mN = 0;

  @Override
  protected List<Cuboid> buildCuboids(final int n) {
    final List<Cuboid> cuboids = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x; y <= n; ++y) {
        for (int z = y; z <= n; ++z) {
          if (x != y && y != z) {
            cuboids.add(new Cuboid(x, y, z));
          }
        }
      }
    }
    Collections.sort(cuboids);
    return cuboids;
  }

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

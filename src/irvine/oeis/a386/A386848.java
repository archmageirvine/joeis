package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A386848 Array read by descending antidiagonals:T(n,k) is the number of ways to partition n X n X n cube into k noncongruent cuboids excluding strict cuboids.
 * @author Sean A. Irvine
 */
public class A386848 extends A386296 {

  @Override
  protected List<Cuboid> buildCuboids(final int n) {
    final List<Cuboid> cuboids = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x; y <= n; ++y) {
        for (int z = y; z <= n; ++z) {
          if (x == y || y == z) {
            cuboids.add(new Cuboid(x, y, z));
          }
        }
      }
    }
    Collections.sort(cuboids);
    return cuboids;
  }
}


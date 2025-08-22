package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * A386903 Array read by descending antidiagonals: T(n,k) is the number of ways to partition n X n X n cube into k noncongruent strict cuboids, n&gt;=5, k&gt;=4.
 * @author Sean A. Irvine
 */
public class A386903 extends A386296 {

  private int mN = 0;
  private int mM = 0;

  /** Construct the sequence. */
  public A386903() {
    super(5);
  }

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
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 5, mN - mM + 3);
  }

  /**
   * Run a particular case directly.
   * @param args n k
   */
  public static void main(final String[] args) {
    final A386903 s = new A386903();
    System.out.println(s.t(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}

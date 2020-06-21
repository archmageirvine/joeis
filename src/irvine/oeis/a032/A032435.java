package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032435 Triangle of <code>second-to-last</code> man to survive in Josephus problem of n men in a circle with every k-th killed, with <code>k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A032435 implements Sequence {

  private int mN = 1;
  private int mM = 1;

  /**
   * Construct the Josephus permutation for specified conditions.
   * The men are numbered 0 to <code>men-1</code>.
   * @param men number of men
   * @param step step
   * @return permutation of death order
   */
  public static int[] josephus(final int men, final int step) {
    final int[] res = new int[men];
    final int[] circle = new int[men];
    for (int k = 0; k < circle.length; ++k) {
      circle[k] = (k + 1) % men;
    }
    for (int k = 0, j = circle[circle.length - 1], p = 0; k < res.length; ++k) {
      for (int i = 0; i < step; ++i) {
        p = j;
        j = circle[j];
      }
      res[k] = j;
      circle[p] = circle[j];
    }
    return res;
  }


  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    System.out.println(Arrays.toString(josephus(mN, mM)));
    return Z.valueOf(josephus(mN, mM)[mN - 2] + 1);
  }

}

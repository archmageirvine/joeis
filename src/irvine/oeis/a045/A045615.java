package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045615 Number of level n genus 0 subgroups of PSL(2,Z) up to conjugacy.
 * @author Sean A. Irvine
 */
public class A045615 implements Sequence {

  private static final int[] SMALL = {1, 3, 4, 7, 8, 12, 11, 18, 10, 7, 2, 11, 3, 4, 4, 9, 0, 6, 0, 1, 2, 0, 0, 1, 2, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return Z.ZERO;
  }
}

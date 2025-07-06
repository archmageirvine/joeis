package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A078595 Number of pairs (x,y) 1&lt;=x&lt;=y&lt;=n such that 1/x+1/y+1/n = 1/2.
 * @author Sean A. Irvine
 */
public class A078595 extends Sequence1 implements Conjectural {

  // Conjectured to be 0 beyond this range
  private static final long[] SMALL = {0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 2, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= SMALL.length ? Z.valueOf(SMALL[(int) (mN - 1)]) : Z.ZERO;
  }
}


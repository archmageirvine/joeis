package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078594 Number of pairs (x,y) 1&lt;=x&lt;=y&lt;=n such that 1/x+1/y+1/n &gt; 1/2.
 * @author Sean A. Irvine
 */
public class A078594 extends Sequence1 {

  private static final long[] SMALL = {1, 3, 6, 10, 15, 20, 24, 26, 29, 30, 33, 34, 36, 37, 38, 40, 42, 43, 45, 46, 48, 50, 52, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 88};
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN <= SMALL.length ? SMALL[(int) (mN - 1)] : 2 * mN + 4);
  }
}


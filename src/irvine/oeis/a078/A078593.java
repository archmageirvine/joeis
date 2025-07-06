package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078593 Number of pairs (x,y) 1&lt;=x&lt;=y&lt;=n such that 1/x+1/y+1/n &lt; 1/2.
 * @author Sean A. Irvine
 */
public class A078593 extends Sequence1 {

  private static final long[] SMALL = {0, 0, 0, 0, 0, 0, 4, 9, 16, 24, 33, 42, 55, 68, 81, 96, 111, 127, 145, 163, 183, 203, 224, 246, 270, 294, 319, 345, 372, 400, 429, 459, 490, 522, 555, 589, 624, 660, 697, 735, 774, 814};
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN <= SMALL.length ? SMALL[(int) (mN - 1)] : (mN * mN - 3 * mN - 8) / 2);
  }
}


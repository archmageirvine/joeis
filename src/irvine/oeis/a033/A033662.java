package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033662 Possible digital sums of Smith numbers (conjectural).
 * @author Sean A. Irvine
 */
public class A033662 implements Sequence {

  // Conjectural

  private static final long[] SMALL = {4, 9, 13, 15};
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN < SMALL.length ? SMALL[(int) mN] : mN + 13);
  }
}

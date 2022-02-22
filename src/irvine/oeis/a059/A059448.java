package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059448 The parity of the number of zero digits when n is written in binary.
 * @author Georg Fischer
 */
public class A059448 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN, 2);
    return Z.valueOf(cnts[0] & 1);
  }
}

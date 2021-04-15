package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043545 (Maximal base-2 digit of n) - (minimal base-2 digit of n).
 * @author Sean A. Irvine
 */
public class A043545 implements Sequence {

  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = (1L << ++mN) - 1;
      return Z.ZERO;
    }
    return Z.ONE;
  }
}

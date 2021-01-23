package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035214 2 followed by a run of n 1's.
 * @author Sean A. Irvine
 */
public class A035214 implements Sequence {

  private long mM = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      return Z.TWO;
    }
    return Z.ONE;
  }
}


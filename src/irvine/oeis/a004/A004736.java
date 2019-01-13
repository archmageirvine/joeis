package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004736.
 * @author Sean A. Irvine
 */
public class A004736 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = mN;
    }
    return Z.valueOf(mM);
  }
}


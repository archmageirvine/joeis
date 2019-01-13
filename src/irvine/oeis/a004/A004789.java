package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004789.
 * @author Sean A. Irvine
 */
public class A004789 extends A004788 {

  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    ++mN;
    do {
      ++mM;
    } while (super.next().longValueExact() != mN);
    return Z.valueOf(mM);
  }
}


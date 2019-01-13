package irvine.oeis.a225;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a165.A165430;

/**
 * A225174.
 * @author Sean A. Irvine
 */
public class A225174 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(A165430.gcud(mN - mM + 1, mM));
  }
}

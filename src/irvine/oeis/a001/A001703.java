package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001703 Decimal concatenation of <code>n, n+1</code>, and <code>n+2</code>.
 * @author Sean A. Irvine
 */
public class A001703 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(mN) + String.valueOf(mN + 1) + String.valueOf(mN + 2));
  }
}

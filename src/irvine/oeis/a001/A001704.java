package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001704 <code>a(n) = n</code> concatenated with <code>n + 1</code>.
 * @author Sean A. Irvine
 */
public class A001704 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(mN) + String.valueOf(mN + 1));
  }
}

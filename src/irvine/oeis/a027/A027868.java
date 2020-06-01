package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027868 Number of trailing zeros in <code>n!;</code> highest power of 5 dividing <code>n!</code>.
 * @author Sean A. Irvine
 */
public class A027868 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    long t = 5;
    while (t <= mN) {
      c += mN / t;
      t *= 5;
    }
    return Z.valueOf(c);
  }
}

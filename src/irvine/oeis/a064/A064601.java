package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A064601 a(n) = # { p | A064558(k) = p prime and k &lt;= n}.
 * @author Sean A. Irvine
 */
public class A064601 extends Sequence1 {

  private final Sequence mA = new A064558();
  private long mCount = 0;

  @Override
  public Z next() {
    if (mA.next().isProbablePrime()) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}

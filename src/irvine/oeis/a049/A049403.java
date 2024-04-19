package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030528;

/**
 * A049403 A triangle of numbers related to triangle A030528; array a(n,m), read by rows (1 &lt;= m &lt;= n).
 * @author Sean A. Irvine
 */
public class A049403 extends Sequence1 {

  private final Sequence mA = new A030528();
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mA.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).shiftRight(mN - mM);
  }
}

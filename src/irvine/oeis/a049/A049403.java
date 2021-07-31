package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a030.A030528;

/**
 * A049403 A triangle of numbers related to triangle A030528; array a(n,m), read by rows (1 &lt;= m &lt;= n).
 * @author Sean A. Irvine
 */
public class A049403 extends A030528 {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    return super.next().multiply(mF.factorial(mN)).divide(mF.factorial(mM)).shiftRight(mN - mM);
  }
}

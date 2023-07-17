package irvine.oeis.a064;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064542 a(n) = Max { k | k! &lt;= n! / k! } where m! = A000142(m), factorial.
 * @author Sean A. Irvine
 */
public class A064542 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    final Z f = MemoryFactorial.SINGLETON.factorial(++mN).sqrt();
    if (mF.compareTo(f) <= 0) {
      mF = MemoryFactorial.SINGLETON.factorial(++mM + 1);
    }
    return Z.valueOf(mM);
  }
}


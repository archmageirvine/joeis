package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072986 Least k such that Product_{i=1..k} (prime(i) + 1) &gt;= n*Product_{i=1..k} prime(i).
 * @author Sean A. Irvine
 */
public class A072986 extends A000040 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mK = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    do {
      ++mK;
      final Z p = super.next();
      mA = mA.multiply(p);
      mB = mB.multiply(p.add(1));
    } while (mA.multiply(mN).compareTo(mB) > 0);
    return Z.valueOf(mK);
  }
}


package irvine.oeis.a064;

import irvine.math.function.Functions;
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
    final int n1 = ++mN;
    final Z f = Functions.FACTORIAL.z(n1).sqrt();
    if (mF.compareTo(f) <= 0) {
      final int n = ++mM + 1;
      mF = Functions.FACTORIAL.z(n);
    }
    return Z.valueOf(mM);
  }
}


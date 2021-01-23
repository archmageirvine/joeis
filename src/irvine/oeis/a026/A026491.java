package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001285;

/**
 * A026491 a(n) = least k &gt; a(n-1) such that t(k) = t(n), for n &gt;= 1, where t = A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026491 implements Sequence {

  private final Sequence mA = new A001285();
  private final Sequence mB = new A001285();
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mB.next();
      ++mN;
      return Z.ONE;
    }
    final Z a = mA.next();
    do {
      ++mN;
    } while (!a.equals(mB.next()));
    return Z.valueOf(mN);
  }
}

package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001285;

/**
 * A026491 <code>a(n) =</code> least k <code>&gt; a(n-1)</code> such that <code>t(k) = t(n)</code>, for <code>n &gt;= 1</code>, where t <code>= A001285 (Thue-Morse</code> sequence).
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

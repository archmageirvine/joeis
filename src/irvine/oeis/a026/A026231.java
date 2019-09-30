package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026231 <code>a(n) = n-th</code> number k such that <code>A026166(k) = A026142(k) + 1</code>.
 * @author Sean A. Irvine
 */
public class A026231 extends A026142 {

  private final Sequence mS = new A026166();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().subtract(1).equals(super.next()));
    return Z.valueOf(mN);
  }
}

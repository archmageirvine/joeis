package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026229 n-th number k such that <code>t(k) = s(k) + 2</code>, where s <code>= A026142, t = A026166</code>.
 * @author Sean A. Irvine
 */
public class A026229 extends A026142 {

  private final Sequence mS = new A026166();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().add(2).equals(super.next()));
    return Z.valueOf(mN);
  }
}

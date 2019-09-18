package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a001.A001285;

/**
 * A026147 <code>a(n) =</code> position of <code>n-th 1</code> in <code>A001285</code> or <code>A010059 (Thue-Morse</code> sequence).
 * @author Sean A. Irvine
 */
public class A026147 extends A001285 {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Z.ONE.equals(super.next()));
    return Z.valueOf(mN);
  }
}

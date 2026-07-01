package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395429 allocated for Maju Wu.
 * @author Sean A. Irvine
 */
public class A395429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int seen = 0;
    long k = 0;
    while (seen != 0b1111111110) {
      seen |= 1 << (Z.valueOf(++k).pow(mN).toString().charAt(0) - '0');
    }
    return Z.valueOf(k);
  }
}

package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059867 Number of irreducible representations of the symmetric group S_n that have odd degree.
 * @author Sean A. Irvine
 */
public class A059867 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    int t = 0;
    int a = 0;
    while (m != 0) {
      if ((m & 1) == 1) {
        t += a;
      }
      ++a;
      m >>>= 1;
    }
    return Z.ONE.shiftLeft(t);
  }
}

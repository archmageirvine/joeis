package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087381 Let Compri(n) be the number obtained by replacing each prime digit (2,3,5,7) of n with a '1' and a composite digit( 0,4,6,8,9) with a '0'. A 1 remains the same. a(n) = Compri(n).
 * @author Sean A. Irvine
 */
public class A087381 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long t = ++mN;
    long r = 0;
    long m = 1;
    while (t != 0) {
      final long d = t % 10;
      if (d == 1 || d == 2 || d == 3 || d == 5 || d == 7) {
        r += m;
      }
      t /= 10;
      m *= 10;
    }
    return Z.valueOf(r);
  }
}

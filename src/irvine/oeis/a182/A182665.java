package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A182665 Greatest x &lt; n such that n divides x*(x-1).
 * @author Georg Fischer
 */
public class A182665 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    // forstep(x=n-1, 0, -1, if(!((x*(x-1))%n), return(x)));
    ++mN;
    for (long x = mN - 1; x >= 0; --x) {
      final long xx1 = x * (x - 1);
      if (xx1 % mN == 0) {
        return Z.valueOf(x);
      }
    }
    return Z.ONE;
  }
}

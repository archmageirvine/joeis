package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393336 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A393336 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 0;
    long k = 0;
    do {
      s -= (1 - 2 * (m & 1)) * ++k;
      m >>>= 1;
    } while (m != 0);
    return Z.valueOf(s);
  }
}

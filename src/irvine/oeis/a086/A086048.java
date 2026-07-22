package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a033.A033308;

/**
 * A086048 Position of first occurrence of n in concatenated primes (A033308, Copeland-Erdos constant).
 * @author Sean A. Irvine
 */
public class A086048 extends Sequence0 {

  private final Sequence mCopeland = new A033308();
  private final StringBuilder mC = new StringBuilder("0");
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    while (mC.indexOf(s) < 0) {
      for (int k = 0; k < 100; ++k) {
        mC.append(mCopeland.next());
      }
    }
    return Z.valueOf(mC.indexOf(s) + 1);
  }
}

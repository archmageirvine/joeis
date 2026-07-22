package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a033.A033308;

/**
 * A086049 Position of first occurrence of n-th prime in concatenated primes (A033308, Copeland-Erdos constant).
 * @author Sean A. Irvine
 */
public class A086049 extends A000040 {

  private final Sequence mCopeland = new A033308();
  private final StringBuilder mC = new StringBuilder("0");

  @Override
  public Z next() {
    final String s = String.valueOf(super.next());
    while (mC.indexOf(s) < 0) {
      for (int k = 0; k < 100; ++k) {
        mC.append(mCopeland.next());
      }
    }
    return Z.valueOf(mC.indexOf(s) + 1);
  }
}

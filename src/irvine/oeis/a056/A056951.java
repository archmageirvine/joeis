package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A056951 Triangle whose rows show the result of flipping the first, first two, ... and finally first n coins when starting with the stack (1,2,3,4,...,n) [starting with all heads up, where signs show whether particular coins end up heads or tails].
 * @author Georg Fischer
 */
public class A056951 extends Triangle {

  /** Construct the sequence. */
  public A056951() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    if (n == 1) {
      return Z.valueOf(-n);
    } else if (n == k) {
      return Z.valueOf(n - 1);
    } else {
      return Z.valueOf(2 * k - n - (2 * k <= n + 1 ? 2 : 1));
    }
  }
}

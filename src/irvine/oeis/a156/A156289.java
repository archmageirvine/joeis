package irvine.oeis.a156;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A156289 Triangle read by rows: T(n,k) is the number of end rhyme patterns of a poem of an even number of lines (2n) with 1&lt;=k&lt;=n evenly rhymed sounds.
 * @author Georg Fischer
 */
public class A156289 extends Triangle {

  /** Construct the sequence. */
  public A156289() {
    setOffset(1);
    hasRAM(false);
  }

  /* T(n, 1)=1 for 1<=n; T(n,k)=0 for 1<=n<k; T(n,k) = (2k-1)*T(n-1,k-1) + k^2*T(n-1,k) 1<k<=n. */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? Z.ONE : get(n - 2, k - 2).multiply(2L * k - 1).add(get(n - 2, k - 1).multiply((long) k * k));
  }
}

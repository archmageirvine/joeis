package irvine.oeis.a276;
// Generated by gen_seq4.pl 2024-07-01/multraf at 2024-07-01 18:26

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a028.A028234;
import irvine.oeis.a055.A055396;
import irvine.oeis.a067.A067029;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A276935 Number of distinct prime factors prime(k) of n such that prime(k)^k, but not prime(k)^(k+1) is a divisor of n.
 * @author Georg Fischer
 */
public class A276935 extends MultiTransformSequence {

  private static final DirectSequence A028234 = new A028234();
  private static final DirectSequence A055396 = new A055396();
  private static final DirectSequence A067029 = new A067029();

  /** Construct the sequence. */
  public A276935() {
    super(1, (self, n) -> self.a(A028234.a(n).intValueExact()).add(A067029.a(n).compareTo(A055396.a(n)) == 0 ? Z.ONE : Z.ZERO), "0");
  }
}

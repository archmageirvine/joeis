package irvine.oeis.a239;
// manually primen/primenp at 2022-04-02 17:22

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060822;

/**
 * A239885 a(n) = 2^(n-2) * prime(n).
 * @author Georg Fischer
 */
public class A239885 extends PrependSequence {

  /** Construct the sequence. */
  public A239885() {
    super(1, new A060822(1, (n, p) -> Z.valueOf(p).multiply(Z.TWO.pow(Z.valueOf(n).subtract(Z.TWO)))), 1);
  }
}

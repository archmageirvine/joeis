package irvine.oeis.a262;
// manually primen/primenp at 2022-04-05 20:54

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A262708 a(n) = p-(p/5) where p = prime(n) and (p/5) is a Legendre symbol.
 * @author Georg Fischer
 */
public class A262708 extends A060822 {

  /** Construct the sequence. */
  public A262708() {
    super(4, (n, p) -> Z.valueOf(p).subtract(LongUtils.jacobi(p, 5)));
  }
}

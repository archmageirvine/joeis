package irvine.oeis.a281;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a122.A122865;

/**
 * A281453 Expansion of f(x, x) * f(x^7, x^11) in powers of x where f(, ) is Ramanujan's general theta function.
 * <code>a(n) = A122865(3*n + 1).</code>
 * @author Georg Fischer
 */
public class A281453 extends Sequence0 {

  private final A122865 mSeq = new A122865();

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    mSeq.next();
    return result;
  }
}

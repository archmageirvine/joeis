package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.a214.A214938;

/**
 * A291090 a(n) = A214938(2n).
 * @author Georg Fischer
 */
public class A291090 extends A214938 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}

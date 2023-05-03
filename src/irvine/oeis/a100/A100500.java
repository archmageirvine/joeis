package irvine.oeis.a100;
// manually n3 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a034.A034961;

/**
 * A100500 a(n) = prime(3n-2) + prime(3n-1) + prime(3n).
 * @author Georg Fischer
 */
public class A100500 extends A034961 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}

package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A144613 a(n) = sigma(3*n) = A000203(3*n).
 * @author Georg Fischer
 */
public class A144613 extends A000203 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}

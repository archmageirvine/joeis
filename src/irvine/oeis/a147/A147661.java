package irvine.oeis.a147;
// manually knest at 2023-06-02 20:44

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000312;

/**
 * A147661 a(n) = squarefree part of n^n.
 * @author Georg Fischer
 */
public class A147661 extends A000312 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).core();
  }
}

package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A141458 a(n) = A000111(2n) + A000111(2n+1).
 * @author Georg Fischer
 */
public class A141458 extends A000111 {

  @Override
  public Z next() {
    return super.next().add(super.next());
  }
}

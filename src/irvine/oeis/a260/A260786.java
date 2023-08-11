package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A260786 Twice the Euler or up/down numbers A000111.
 * @author Georg Fischer
 */
public class A260786 extends A000111 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

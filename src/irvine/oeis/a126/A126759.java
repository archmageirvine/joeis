package irvine.oeis.a126;

import irvine.math.z.Z;

/**
 * A126759 a(0) = 1; a(2n) = a(n); a(3n) = a(n); otherwise write n = 6i+j, where j = 1 or 5 and set a(n) = 2i+2 if j = 1, otherwise a(n) = 2i+3.
 * @author Georg Fischer
 */
public class A126759 extends A126760 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

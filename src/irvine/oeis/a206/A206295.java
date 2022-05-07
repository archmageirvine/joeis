package irvine.oeis.a206;

import irvine.math.z.Z;
import irvine.oeis.a007.A007188;

/**
 * A206295 (1/6)*A007188(n).
 * @author Georg Fischer
 */
public class A206295 extends A007188 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}

package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a077.A077722;

/**
 * A079107 Number of digits of A077722(n) written in base 8.
 * @author Georg Fischer
 */
public class A079107 extends A077722 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString(8).length());
  }
}

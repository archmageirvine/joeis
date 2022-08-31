package irvine.oeis.a347;

import irvine.math.z.Z;
import irvine.oeis.a209.A209229;

/**
 * A347523 Characteristic function of nonpowers of 2.
 * @author Georg Fischer
 */
public class A347523 extends A209229 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}

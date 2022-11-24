package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.a056.A056038;

/**
 * A105350 Largest squared factorial dividing n!.
 * @author Georg Fischer
 */
public class A105350 extends A056038 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

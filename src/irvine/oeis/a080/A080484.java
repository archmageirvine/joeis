package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080484 A080483(n)/3.
 * @author Georg Fischer
 */
public class A080484 extends A080483 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}

package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055772 Square root of largest square dividing n!.
 * @author Sean A. Irvine
 */
public class A055772 extends A055071 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

package irvine.oeis.a277;

import irvine.math.z.Z;

/**
 * A277599 (1/5)*A277592.
 * @author Georg Fischer
 */
public class A277599 extends A277592 {

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}

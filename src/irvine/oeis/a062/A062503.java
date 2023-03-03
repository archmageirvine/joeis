package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062503 Squarefree numbers squared.
 * @author Georg Fischer
 */
public class A062503 extends A005117 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

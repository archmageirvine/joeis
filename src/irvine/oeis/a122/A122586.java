package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122586 Leading digit of n expressed in base 3.
 * @author Georg Fischer
 */
public class A122586 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(Z.valueOf(mN).toString(3).charAt(0) - '0');
  }
}

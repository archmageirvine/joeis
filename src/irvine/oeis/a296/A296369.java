package irvine.oeis.a296;

import irvine.math.z.Z;
import irvine.oeis.a055.A055685;

/**
 * A296369 Numbers m such that 2^m == -1/2 (mod m).
 * @author Georg Fischer
 */
public class A296369 extends A055685 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

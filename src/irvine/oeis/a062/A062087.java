package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a005.A005117;

/**
 * A062087 Squarefree numbers with all prime digits.
 * @author Georg Fischer
 */
public class A062087 extends A005117 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.toString().matches("[2357]+")) {
        return result;
      }
    }
  }
}

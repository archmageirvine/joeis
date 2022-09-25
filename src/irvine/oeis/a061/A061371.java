package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a002.A002808;

/**
 * A061371 Composite numbers with all prime digits.
 * @author Georg Fischer
 */
public class A061371 extends A002808 implements SequenceWithOffset {

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

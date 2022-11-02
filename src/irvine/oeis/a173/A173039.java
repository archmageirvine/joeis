package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061037;

/**
 * A173039 Odd numerators of the fractions (1/4-1/n^2), n&gt;= -2.
 * @author Georg Fischer
 */
public class A173039 extends PrependSequence {

  /** Construct the sequence. */
  public A173039() {
    super(1, new A061037(), -3, -1, -3);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isOdd()) {
        return result;
      }
    }
  }
}

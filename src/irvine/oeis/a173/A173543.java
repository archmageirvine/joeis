package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;

/**
 * A173543 Ulam numbers that are cubes.
 * @author Georg Fischer
 */
public class A173543 extends Sequence1 {

  private final A002858 mSeq = new A002858();

  @Override
  public Z next() {
    while (true) {
      final Z result = mSeq.next();
      final Z rt = result.root(3);
      if (result.auxiliary() == 1) {
        return result;
      }
    }
  }
}

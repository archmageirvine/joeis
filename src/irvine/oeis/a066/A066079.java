package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005563;

/**
 * A066079 Arises in detailed black hole state counting in loop quantum gravity.
 * @author Sean A. Irvine
 */
public class A066079 extends Sequence1 {

  private final Sequence mA = new A005563().skip();
  private final HashSet<Z> mSquareFreeParts = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z n = mA.next();
      if (mSquareFreeParts.add(Functions.CORE.z(n))) {
        return n;
      }
    }
  }
}

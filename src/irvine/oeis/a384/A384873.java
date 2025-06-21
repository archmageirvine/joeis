package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002275;

/**
 * A384873 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A384873 extends Sequence1 {

  private final Sequence mR = new A002275().skip();

  @Override
  public Z next() {
    Z r = mR.next().subtract(1);
    while (true) {
      r = Functions.NEXT_PRIME.z(r);
      if ((Functions.SYNDROME.i(r) & 1) == 0) {
        return r;
      }
    }
  }
}


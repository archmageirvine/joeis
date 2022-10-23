package irvine.oeis.a003;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003657 Discriminants of imaginary quadratic fields, negated.
 * @author Sean A. Irvine
 */
public class A003657 extends Sequence1 {

  long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN -= 1;
      if ((mN & 3) <= 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(-mN);
        }
      }
    }
  }
}

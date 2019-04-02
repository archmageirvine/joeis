package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.List;

/**
 * A003657 Discriminants of imaginary quadratic fields, negated.
 * @author Sean A. Irvine
 */
public class A003657 implements Sequence {

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

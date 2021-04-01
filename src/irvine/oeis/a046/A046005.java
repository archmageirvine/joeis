package irvine.oeis.a046;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003636;

/**
 * A046005 Discriminants of imaginary quadratic fields with class number 8 (negated).
 * @author Sean A. Irvine
 */
public class A046005 implements Sequence {

  long mN = -2;

  protected int targetClassNumber() {
    return 8;
  }

  @Override
  public Z next() {
    while (true) {
      mN -= 1;
      if ((mN & 3) <= 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        if (forms.size() == targetClassNumber()) {
          final long classNumber = A003636.classNumber(forms);
          if (classNumber == forms.size()) {
            return Z.valueOf(-mN);
          }
        }
      }
    }
  }
}

package irvine.oeis.a006;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003636;

/**
 * A006641.
 * @author Sean A. Irvine
 */
public class A006641 implements Sequence {

  long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN -= 1;
      if ((mN & 3) <= 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(classNumber);
        }
      }
    }
  }
}

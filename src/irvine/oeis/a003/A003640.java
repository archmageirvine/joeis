package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.List;

/**
 * A003640 Number of genera of imaginary quadratic field with discriminant <code>-k, k =</code> A003657(n).
 * @author Sean A. Irvine
 */
public class A003640 implements Sequence {

  long mN = -2;

  @Override
  public Z next() {
    while (true) {
      --mN;
      if ((mN & 3) <= 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(A003636.genera(mN));
        }
      }
    }
  }
}

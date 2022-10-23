package irvine.oeis.a003;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003642 Number of genera of imaginary quadratic field with discriminant -k, k = A191483(n).
 * @author Sean A. Irvine
 */
public class A003642 extends Sequence1 {

  long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN -= 4;
      if (((mN / 4) & 3) > 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(A003636.genera(mN));
        }
      }
    }
  }
}

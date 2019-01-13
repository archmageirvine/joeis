package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.List;

/**
 * A003642.
 * @author Sean A. Irvine
 */
public class A003642 implements Sequence {

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

package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.List;

/**
 * A003641.
 * @author Sean A. Irvine
 */
public class A003641 implements Sequence {

  long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN -= 4;
      final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
      final long classNumber = A003636.classNumber(forms);
      if (classNumber == forms.size()) {
        return Z.valueOf(A003636.genera(mN));
      }
    }
  }
}

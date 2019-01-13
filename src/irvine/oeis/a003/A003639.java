package irvine.oeis.a003;

import java.util.List;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003639.
 * @author Sean A. Irvine
 */
public class A003639 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      --mN;
      final long n = -mN;
      if (LongUtils.isSquareFree(n)) {
        final long d = (mN & 3) == 1 ? mN : 4 * mN;
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(d);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(classNumber / A003636.genera(d));
        }
      }
    }
  }
}

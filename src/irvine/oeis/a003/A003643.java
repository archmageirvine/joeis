package irvine.oeis.a003;

import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003643 Number of genera of Q(sqrt(-n)), n squarefree.
 * @author Sean A. Irvine
 */
public class A003643 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      --mN;
      final long n = -mN;
      if (Predicates.SQUARE_FREE.is(n)) {
        final long d = (mN & 3) == 1 ? mN : 4 * mN;
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(d);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(A003636.genera(d));
        }
      }
    }
  }
}

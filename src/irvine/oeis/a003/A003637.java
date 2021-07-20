package irvine.oeis.a003;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003637 Number of classes per genus in quadratic field with discriminant -4n+1.
 * @author Sean A. Irvine
 */
public class A003637 implements Sequence {

  long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN -= 4;
      final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
      final long classNumber = A003636.classNumber(forms);
      if (classNumber == forms.size()) {
        return Z.valueOf(classNumber / A003636.genera(mN));
      }
    }
  }
}

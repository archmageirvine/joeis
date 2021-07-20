package irvine.oeis.a003;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003638 Number of classes per genus in quadratic field with discriminant -4n, -n == 2,3( mod 4).
 * @author Sean A. Irvine
 */
public class A003638 implements Sequence {

  long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN -= 4;
      if (((mN / 4) & 3) > 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        final long classNumber = A003636.classNumber(forms);
        if (classNumber == forms.size()) {
          return Z.valueOf(classNumber / A003636.genera(mN));
        }
      }
    }
  }
}

package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086786.
 * @author Sean A. Irvine
 */
public class A086791 extends Sequence1 {

  private final Convergents mConvergents = new Convergents(CR.E);

  @Override
  public Z next() {
    while (true) {
      final Z n = mConvergents.next().num();
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}

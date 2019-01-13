package irvine.oeis.a002;

import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a030.A030125;

/**
 * A002794.
 * @author Sean A. Irvine
 */
public class A002794 extends A030125 {

  private long mN = 0;

  protected Q nextConvergent() {
    super.next(); // ensure precision
    // Restep every time due to changing precision
    final Convergents conv = new Convergents(getCR());
    ++mN;
    for (int k = 0; k < mN; ++k) {
      conv.next();
    }
    return conv.next();
  }

  @Override
  public Z next() {
    return nextConvergent().num();
  }
}

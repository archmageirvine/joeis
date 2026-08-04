package irvine.oeis.a089;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030101;
import irvine.oeis.a062.A062383;

/**
 * A089618 Continued fraction elements constructed out of the van der Corput discrepancy sequence.
 * @author Sean A. Irvine
 */
public class A089618 extends Sequence1 {

  private final Sequence mA = new A030101().skip();
  private final Sequence mB = new A062383().skip();

  @Override
  public Z next() {
    final Q pow = new Q(mA.next(), mB.next());
    return CR.TWO.pow(pow).subtract(1).inverse().floor();
  }
}

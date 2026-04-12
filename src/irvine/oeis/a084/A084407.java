package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A084407 Number of decimal places to which the n-th convergent of continued fraction expansion of Pi matches with the correct value.
 * @author Sean A. Irvine
 */
public class A084407 extends Sequence1 {

  private final Convergents mC = new Convergents(CR.PI);

  @Override
  public Z next() {
    final Sequence pi = new A000796();
    Q c = mC.next();
    long cnt = -1;
    while (c.toZ().equals(pi.next())) {
      ++cnt;
      c = c.frac().multiply(10);
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a356;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a002.A002485;
import irvine.oeis.a002.A002486;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A356665 Number of correct decimal digits of the approximation of Pi obtained from the continued fraction convergents A002485(n)/A002486(n).
 * @author Sean A. Irvine
 */
public class A356665 extends Sequence2 {

  private final Sequence mNum = new SkipSequence(new A002485(), 2);
  private final Sequence mDen = new SkipSequence(new A002486(), 2);

  @Override
  public Z next() {
    final DecimalExpansionSequence approx = new DecimalExpansionSequence(CR.valueOf(mNum.next()).divide(CR.valueOf(mDen.next())));
    final A000796 pi = new A000796();
    long cnt = 0;
    while (pi.next().equals(approx.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

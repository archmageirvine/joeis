package irvine.oeis.a138;
// Generated by gen_seq4.pl bisect at 2022-12-24 12:44

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a132.A132999;

/**
 * A138830 Bisection of imperfect numbers A132999.
 * @author Georg Fischer
 */
public class A138830 extends Sequence1 {

  private final A132999 mSeq = new A132999();

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next();
  }
}

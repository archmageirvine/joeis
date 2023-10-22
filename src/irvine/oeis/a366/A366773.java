package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001045;

/**
 * A366773.
 * @author Sean A. Irvine
 */
public class A366773 extends Sequence1 {

  private final Sequence mSeq1 = new A001045().skip();

  @Override
  public Z next() {
    return Euler.phi(mSeq1.next());
  }
}

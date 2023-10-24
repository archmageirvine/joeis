package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A366819.
 * @author Sean A. Irvine
 */
public class A366819 extends Sequence2 {

  private final Sequence mSeq = new A048861().skip();

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma();
  }
}

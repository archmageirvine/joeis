package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014566;

/**
 * A366819.
 * @author Sean A. Irvine
 */
public class A366820 extends Sequence0 {

  private final Sequence mSeq = new A014566();

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma();
  }
}

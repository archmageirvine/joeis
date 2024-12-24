package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061214;

/**
 * A073836 Let C(n) = product of composite numbers between the n-th prime and (n+1)-th prime; a(n) = floor(C(n+1)/C(n)).
 * @author Sean A. Irvine
 */
public class A073836 extends Sequence1 {

  private final Sequence mSeq = new A061214().skip();
  private Z mC = mSeq.next();

  @Override
  public Z next() {
    final Z t = mC;
    mC = mSeq.next();
    return mC.divide(t);
  }
}

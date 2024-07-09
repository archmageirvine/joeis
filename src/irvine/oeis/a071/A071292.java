package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A071292 Call f(n) the sum of the first n primes then a(n) is the number of squares between f(n) and f(n+1).
 * @author Sean A. Irvine
 */
public class A071292 extends Sequence1 {

  private final Sequence mSeq = new A007504().skip();
  private Z mF = mSeq.next();

  @Override
  public Z next() {
    final Z t = mF;
    mF = mSeq.next();
    return Functions.SQRT.z(mF).subtract(Functions.CEIL_SQRT.z(t)).add(1);
  }
}

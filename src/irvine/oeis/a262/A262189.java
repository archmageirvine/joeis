package irvine.oeis.a262;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A262189 a(n) = Fibonacci(n+1)! / Fibonacci(n).
 * @author Georg Fischer
 */
public class A262189 extends Sequence1 {

  private final Sequence mSeq = new A000045();
  private Z mA;
  private Z mB;

  {
    mSeq.next();
    mA = mSeq.next();
    mB = mSeq.next();
  }

  @Override
  public Z next() {
    final Z result = Functions.FACTORIAL.z(mB.intValue()).divide(mA);
    mA = mB;
    mB = mSeq.next();
    return result;
  }
}

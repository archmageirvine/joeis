package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051953;

/**
 * A049586 a(n) is the GCD of the cototients (A051953) of n and n+1.
 * @author Sean A. Irvine
 */
public class A049586 extends AbstractSequence {

  private final A051953 mSeq1 = new A051953();

  /** Construct the sequence. */
  public A049586() {
    super(0);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return mA.gcd(t);
  }
}


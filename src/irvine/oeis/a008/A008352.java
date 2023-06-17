package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008352 a(n) is formed by concatenating a(n-2) and a(n-1), with a(0) = 1, a(1) = 2;.
 * @author Sean A. Irvine
 */
public class A008352 extends AbstractSequence {

  /** Construct the sequence. */
  public A008352() {
    super(0);
  }

  private String mA = null;
  private String mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
      return Z.ONE;
    }
    if (mB == null) {
      mB = "2";
      return Z.TWO;
    }
    final String t = mA + mB;
    mA = mB;
    mB = t;
    return new Z(t);
  }
}


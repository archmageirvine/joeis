package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001080 <code>a(n) = 16*a(n-1) - a(n-2)</code> with <code>a(0) = 0, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A001080 implements Sequence {

  private Z mA = Z.valueOf(-48);
  private Z mB = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(4).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}


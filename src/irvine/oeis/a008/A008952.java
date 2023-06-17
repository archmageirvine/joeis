package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A008952 Leading digit of 2^n.
 * @author Sean A. Irvine
 */
public class A008952 extends AbstractSequence {

  /* Construct the sequence. */
  public A008952() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return Z.valueOf(mA.toString().charAt(0) - '0');
  }
}

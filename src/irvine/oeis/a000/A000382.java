package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000382 Restricted permutations.
 * @author Sean A. Irvine
 */
public class A000382 extends AbstractSequence {

  /** Construct the sequence. */
  public A000382() {
    super(4);
  }

  private static final Z TF = Z.valueOf(35);
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.FIVE;

  @Override
  public Z next() {
    // WARNING: This formula appears to be conjectural
    Z t = mA.add(mB).add(mC).subtract(2);
    if (t.equals(TF)) {
      t = t.add(1);
    }
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

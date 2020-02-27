package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028982 Squares and twice squares.
 * @author Sean A. Irvine
 */
public class A028982 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z as = mA.square();
    final Z bs2 = mB.square().multiply2();
    if (as.compareTo(bs2) < 0) {
      mA = mA.add(1);
      return as;
    } else {
      mB = mB.add(1);
      return bs2;
    }
  }
}

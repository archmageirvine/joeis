package irvine.oeis.a210;

import irvine.math.padic.PAdic;
import irvine.math.padic.PAdicField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A210850 Digits of one of the two 5-adic integers sqrt(-1).
 * @author Sean A. Irvine
 */
public class A210850 implements Sequence {

  private final PAdic mA = new PAdicField(5).sqrt(PAdic.create(5, -1));
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mA.get(++mN));
  }
}

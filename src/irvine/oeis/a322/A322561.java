package irvine.oeis.a322;

import irvine.math.padic.PAdic;
import irvine.math.padic.PAdicField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A322561 Digits of one of the two 17-adic integers sqrt(2) that is related to A322559.
 * @author Sean A. Irvine
 */
public class A322561 implements Sequence {

  private final PAdic mA = new PAdicField(17).sqrt(PAdic.create(17, 2));
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mA.get(++mN));
  }
}

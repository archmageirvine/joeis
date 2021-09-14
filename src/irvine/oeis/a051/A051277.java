package irvine.oeis.a051;

import irvine.math.padic.PAdic;
import irvine.math.padic.PAdicField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051452.
 * @author Sean A. Irvine
 */
public class A051277 implements Sequence {

  private final PAdic mA = new PAdicField(7).sqrt(PAdic.create(7, 2));
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mA.get(++mN));
  }
}

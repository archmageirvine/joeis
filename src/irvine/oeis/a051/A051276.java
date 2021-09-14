package irvine.oeis.a051;

import irvine.math.padic.PAdic;
import irvine.math.padic.PAdicField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051452.
 * @author Sean A. Irvine
 */
public class A051276 implements Sequence {

  private final PAdic mA = new PAdicField(5).sqrt(PAdic.create(5, -1));
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long d = mA.get(++mN);
      if (d != 0) {
        return Z.valueOf(d);
      }
    }
  }
}

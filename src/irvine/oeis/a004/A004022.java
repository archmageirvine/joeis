package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004022.
 * @author Sean A. Irvine
 */
public class A004022 implements Sequence {

  private StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    while (true) {
      mS.append('1');
      final Z z = new Z(mS.toString());
      if (z.isProbablePrime()) {
        return z;
      }
    }
  }
}

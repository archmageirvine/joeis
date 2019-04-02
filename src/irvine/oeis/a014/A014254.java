package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A014254 Liponombres: numbers whose French name does not contain the letter "e".
 * @author Sean A. Irvine
 */
public class A014254 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!French.toFrench(++mN).contains("e")) {
        return Z.valueOf(mN);
      }
    }
  }
}

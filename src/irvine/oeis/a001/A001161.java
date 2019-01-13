package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A001161.
 * @author Sean A. Irvine
 */
public class A001161 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if ((English.toRawEnglish(++mN).length() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

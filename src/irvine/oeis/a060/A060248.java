package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.BrazilianPortuguese;

/**
 * A060248 Numbers that begin with the letter "d" in Portuguese.
 * @author Sean A. Irvine
 */
public class A060248 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (BrazilianPortuguese.SINGLETON.toText(++mN).startsWith("d")) {
        return Z.valueOf(mN);
      }
    }
  }
}

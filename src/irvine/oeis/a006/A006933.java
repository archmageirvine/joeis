package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A006933 'Eban' numbers (the letter 'e' is banned!).
 * @author Sean A. Irvine
 */
public class A006933 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!English.toEnglish(mN).contains("e")) {
        return Z.valueOf(mN);
      }
    }
  }
}

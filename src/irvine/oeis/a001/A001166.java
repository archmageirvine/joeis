package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.string.English;

/**
 * A001166 Smallest natural number requiring n letters in English.
 * @author Sean A. Irvine
 */
public class A001166 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    int v = 0;
    while (English.SINGLETON.toText(++v).replace(" ", "").replace("-", "").length() != mN) {
    }
    //System.out.println(mN + " " + English.toEnglish(v).replace(" ", "").replace("-", ""));
    return Z.valueOf(v);
  }
}

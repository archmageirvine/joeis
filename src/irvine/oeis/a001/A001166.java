package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A001166.
 * @author Sean A. Irvine
 */
public class A001166 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    int v = 0;
    while (English.toEnglish(++v).replace(" ", "").replace("-", "").length() != mN) {
    }
    //System.out.println(mN + " " + English.toEnglish(v).replace(" ", "").replace("-", ""));
    return Z.valueOf(v);
  }
}

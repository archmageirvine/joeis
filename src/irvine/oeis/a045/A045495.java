package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A045495 Smallest positive integer requiring at least n letters (not including hyphens) to be spelled out in English.
 * @author Sean A. Irvine
 */
public class A045495 implements Sequence {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (English.SINGLETON.toText(mM).replace(" ", "").replace("-", "").length() < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

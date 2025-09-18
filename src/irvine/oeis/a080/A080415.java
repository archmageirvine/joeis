package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a079.A079101;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080415 extends A079101 {

  private final HashSet<String> mSubstrings = new HashSet<>();

  @Override
  public Z next() {
    super.next();
    for (int k = 0; k < mS.length(); ++k) {
      mSubstrings.add(mS.substring(k));
    }
    return Z.valueOf(mSubstrings.size());
  }
}

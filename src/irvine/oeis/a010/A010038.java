package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Czech;

/**
 * A010038 Number of letters in <code>n (in</code> Czech).
 * @author Sean A. Irvine
 */
public class A010038 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Czech.toCzech(++mN).replace(" ", "").length());
  }
}


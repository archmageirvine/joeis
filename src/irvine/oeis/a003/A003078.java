package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Danish;

/**
 * A003078 Number of letters in n (in Danish).
 * @author Sean A. Irvine
 */
public class A003078 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Danish.SINGLETON.toRawText(++mN).length());
  }
}


package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Polish;

/**
 * A008962 Number of letters in n (in Polish), excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A008962 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Polish.SINGLETON.toRawText(++mN).length());
  }
}


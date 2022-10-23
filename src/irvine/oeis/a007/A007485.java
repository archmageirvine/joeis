package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Dutch;

/**
 * A007485 Number of letters in n (in Dutch).
 * @author Sean A. Irvine
 */
public class A007485 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Dutch.SINGLETON.toRawText(++mN).replace("ij", "i").length());
  }
}

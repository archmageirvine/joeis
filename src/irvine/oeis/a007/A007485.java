package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Dutch;

/**
 * A007485 Number of letters in <code>n (in Dutch)</code>.
 * @author Sean A. Irvine
 */
public class A007485 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Dutch.toDutch(++mN).replace(" ", "").replace("ij", "i").length());
  }
}

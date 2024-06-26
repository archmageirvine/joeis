package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004093 Even numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004093 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Functions.REVERSE.z(mN);
  }
}


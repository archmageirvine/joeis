package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014390 Final 2 digits of <code>7^n</code>.
 * @author Sean A. Irvine
 */
public class A014390 implements Sequence {

  private long mA = 43;

  @Override
  public Z next() {
    mA *= 7;
    mA %= 50;
    return Z.valueOf(mA);
  }
}


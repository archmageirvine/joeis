package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001218.
 * @author Sean A. Irvine
 */
public class A001218 implements Sequence {

  private int mN = 0xAAAAAAAB;

  @Override
  public Z next() {
    mN *= 3;
    mN %= 100;
    return Z.valueOf(mN);
  }
}

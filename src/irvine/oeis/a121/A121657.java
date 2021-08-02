package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A121657 Successive run lengths in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A121657 extends A000796 {

  private Z mA = super.next();

  @Override
  public Z next() {
    long cnt = 0;
    final Z s = mA;
    do {
      ++cnt;
      mA = super.next();
    } while (s.equals(mA));
    return Z.valueOf(cnt);
  }
}


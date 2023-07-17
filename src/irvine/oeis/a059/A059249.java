package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a004.A004489;

/**
 * A059249 Tersum n + (n-1); write n and n-1 in base 3 and add mod 3 with no carries.
 * @author Sean A. Irvine
 */
public class A059249 extends A004489 {

  /** Construct the sequence. */
  public A059249() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z m = mN;
    mN = mN.add(1);
    return tersum(mN, m);
  }
}


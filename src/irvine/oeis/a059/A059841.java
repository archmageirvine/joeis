package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059841 Period 2: Repeat [1,0]. a(n) = 1 - (n mod 2).
 * @author Sean A. Irvine
 */
public class A059841 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.ZERO : Z.ONE;
  }
}


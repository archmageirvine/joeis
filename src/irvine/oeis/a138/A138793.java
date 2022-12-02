package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A138793 a(n) = concatenation of reversed digits of natural numbers from n down to 1.
 * @author Georg Fischer
 */
public class A138793 extends Sequence1 {

  private int mN = 0;
  private String mA = "";

  @Override
  public Z next() {
    ++mN;
    mA = new StringBuilder(String.valueOf(mN)).reverse().toString() + mA;
    return new Z(mA);
  }
}

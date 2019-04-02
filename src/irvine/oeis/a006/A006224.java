package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006224 Rabbytes: group eight successive Fibonacci numbers in binary and translate to decimal.
 * @author Sean A. Irvine
 */
public class A006224 extends A000045 {

  private final Z[] mF = {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO};

  @Override
  public Z next() {
    System.arraycopy(mF, 1, mF, 0, mF.length - 1);
    mF[mF.length - 1] = super.next();
    final StringBuilder binary = new StringBuilder();
    for (final Z f : mF) {
      binary.append(f.toString(2));
    }
    return new Z(binary.toString(), 2);
  }
}

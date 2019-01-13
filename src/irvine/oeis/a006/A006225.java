package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006225.
 * @author Sean A. Irvine
 */
public class A006225 extends A000045 {

  private final String[] mF = {"", "", "", "", "", "", "", ""};

  @Override
  public Z next() {
    System.arraycopy(mF, 1, mF, 0, mF.length - 1);
    mF[mF.length - 1] = new StringBuilder(super.next().toString(2)).reverse().toString();
    final StringBuilder binary = new StringBuilder();
    for (final String f : mF) {
      binary.append(f);
    }
    return new Z(binary.toString(), 2);
  }
}

package irvine.oeis.a329;

import irvine.math.z.Z;

/**
 * A329055 Number of unlabeled bicolored acyclic graphs with n nodes of each color.
 * @author Gregory Morse
 */
public class A329055 extends A329052 {
  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}

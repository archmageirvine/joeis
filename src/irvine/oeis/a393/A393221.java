package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a372.A372254;

/**
 * A393221 Column 1 of A372254.
 * @author Gregory Morse
 */
public class A393221 extends A372254 {
  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 1);
  }
}

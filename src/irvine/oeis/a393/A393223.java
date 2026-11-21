package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a372.A372254;

/**
 * A393223 Column 3 of A372254.
 * @author Gregory Morse
 */
public class A393223 extends A372254 {
  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}

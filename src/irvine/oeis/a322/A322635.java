package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.a333.A333158;

/**
 * A322635 Number of regular graphs with loops on n labeled vertices.
 * @author Gregory Morse
 */
public class A322635 extends A333158 {
  private int mN = 0;

  @Override
  public Z next() {
    return RING.eval(counts(++mN), Z.ONE);
  }
}

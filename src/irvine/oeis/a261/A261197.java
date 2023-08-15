package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A261197 Cubes of the successive terms of the decimal expansion of Pi.
 * @author Georg Fischer
 */
public class A261197 extends A000796 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

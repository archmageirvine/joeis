package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030160 Cubes in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030160 extends A030159 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

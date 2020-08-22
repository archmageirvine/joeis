package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030162 Cubes such that in n and n^(1/3) the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030162 extends A030161 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

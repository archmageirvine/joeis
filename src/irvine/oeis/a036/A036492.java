package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036492 Offsets for the Atkin Partition Congruence theorem.
 * @author Sean A. Irvine
 */
public class A036492 extends A036490 {

  private static final Z Z24 = Z.valueOf(24);

  @Override
  public Z next() {
    return Z24.modInverse(super.next());
  }
}

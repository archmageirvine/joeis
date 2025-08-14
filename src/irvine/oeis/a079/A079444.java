package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079444 Number of 3-cycles in range [A014137(2n+2)..A014138(2n+2)] of permutation A057505 (= Donaghey's automorphism M).
 * @author Sean A. Irvine
 */
public class A079444 extends A079442 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next().divide(3);
  }
}

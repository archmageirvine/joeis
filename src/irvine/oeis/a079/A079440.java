package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079440 Number of transpositions (2-cycles) in range [A014137(n-1)..A014138(n-1)] of permutation A057505 (= Donaghey's automorphism M).
 * @author Sean A. Irvine
 */
public class A079440 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((++mN + 1) / 3 + (mN >= 14 ? (mN - 10) / 4 + (mN - 14) / 8 : 0));
  }
}


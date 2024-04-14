package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037047 Starting at n, "say what you see"; sequence gives number of primes obtained before first composite number appears.
 * @author Sean A. Irvine
 */
public class A037047 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Functions.LOOK_AND_SAY.z(mN);
    long count = 0;
    while (s.isProbablePrime()) {
      s = Functions.LOOK_AND_SAY.z(s);
      ++count;
    }
    return Z.valueOf(count);
  }
}

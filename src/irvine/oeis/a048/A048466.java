package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a047.A047844;

/**
 * A048466 Total number of primes in "generation" n.
 * @author Sean A. Irvine
 */
public class A048466 extends A047844 {

  /** Construct the sequence. */
  public A048466() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    long m = 0;
    while (++m <= mN) {
      if (get(m, mN).isProbablePrime()) {
        ++c;
      }
    }
//    while (get(++m, mN).isOdd()) {
//      if (get(m, mN).isProbablePrime()) {
//        ++c;
//      }
//    }
    return Z.valueOf(c);
  }
}

package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.a036.A036378;

/**
 * A162145 a(n) = the number of noncomposites (primes or 1) that are n digits long when written in binary.
 * @author Georg Fischer
 */
public class A162145 extends A036378 {

  private long mN = 0;

  /** Construct the sequence. */
  public A162145() {
    setOffset(1);

  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return super.next().add(1);
    } else {
      return super.next();
    }
  }
}

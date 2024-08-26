package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048382 Primes resulting from procedure described in A048381.
 * @author Sean A. Irvine
 */
public class A048382 extends A048380 {

  /** Construct the sequence. */
  public A048382() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

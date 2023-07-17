package irvine.oeis.a153;

import irvine.math.z.Z;

/**
 * A153002 Primes in toothpick sequence A153000.
 * @author Sean A. Irvine
 */
public class A153002 extends A153000 {

  /** Construct the sequence. */
  public A153002() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.isPrime()) {
        return p;
      }
    }
  }
}


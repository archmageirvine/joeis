package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A055469 Primes of the form k(k+1)/2+1 (i.e., central polygonal numbers, or one more than triangular numbers).
 * @author Sean A. Irvine
 */
public class A055469 extends A000217 {

  /** Construct the sequence. */
  public A055469() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

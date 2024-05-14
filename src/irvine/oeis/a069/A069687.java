package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069687 Primes that yield another prime on placing a 1 on both sides (as leading and trailing digits).
 * @author Sean A. Irvine
 */
public class A069687 extends A000040 {

  private final char mC;

  protected A069687(final char c) {
    mC = c;
  }

  /** Construct the sequence. */
  public A069687() {
    this('1');
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (new Z(mC + p.toString() + mC).isProbablePrime()) {
        return p;
      }
    }
  }
}

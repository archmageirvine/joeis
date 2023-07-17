package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030463 Previous palindromic prime concatenated with this palindromic prime is prime.
 * @author Sean A. Irvine
 */
public class A030463 extends A002385 {

  /** Construct the sequence. */
  public A030463() {
    super(0);
  }

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = super.next();
      if (new Z(t.toString() + mP).isProbablePrime()) {
        return mP;
      }
    }
  }
}

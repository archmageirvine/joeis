package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a033.A033620;

/**
 * A046349 Composite numbers with only palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046349 extends A033620 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (!palin.isProbablePrime()) {
        return palin;
      }
    }
  }
}

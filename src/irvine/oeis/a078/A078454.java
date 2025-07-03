package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a060.A060324;

/**
 * A078454 Index of the first occurrence of prime(n) in A060324.
 * @author Sean A. Irvine
 */
public class A078454 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Sequence seq = new A060324();
    long k = 0;
    while (true) {
      ++k;
      if (seq.next().equals(p)) {
        return Z.valueOf(k);
      }
    }
  }
}


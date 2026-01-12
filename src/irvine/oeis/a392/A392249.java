package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A392249 Numbers k such that k-1 is a perfect square and k+1 is prime.
 * @author Sean A. Irvine
 */
public class A392249 extends Sequence1 {

  private final Sequence mS = new A000290();

  @Override
  public Z next() {
    while (true) {
      final Z s = mS.next();
      if (s.add(2).isProbablePrime()) {
        return s.add(1);
      }
    }
  }
}


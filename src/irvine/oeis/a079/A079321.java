package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002109;

/**
 * A079321 Composite numbers of the form 1^1 * 2^2 * 3^3 * 4^4 * ... * n^n + 1.
 * @author Sean A. Irvine
 */
public class A079321 extends Sequence1 {

  private final Sequence mA = new A002109();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next().add(1);
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}

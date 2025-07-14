package irvine.oeis.a365;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A365577 Sequence of primitive Pythagorean triples beginning with the triple (3,4,5), with each subsequent triple having as its short leg the sum of the legs of the previous triple, and with the long leg and the hypotenuse of each triple being consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A365577 extends Sequence1 {

  private Triple<Z> mA = null;

  protected Z select(final Triple<Z> t) {
    return t.left();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new Triple<>(Z.THREE, Z.FOUR, Z.FIVE);
    } else {
      final Z u = mA.left().add(mA.mid()).square();
      mA = new Triple<>(mA.left().add(mA.mid()), u.subtract(1).divide2(), u.add(1).divide2());
    }
    return select(mA);
  }
}

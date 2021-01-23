package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000194;
import irvine.oeis.a074.A074294;

/**
 * A035505 Active part of Kimberling's expulsion array as a triangular array.
 * @author Sean A. Irvine
 */
public class A035505 implements Sequence {

  // After Enrique P&eacute;rez Herrero

  private final Sequence mA = new SkipSequence(new A000194(), 1);
  private final Sequence mB = new A074294();

  private Z k(final Z i, final Z j) {
    if (j.compareTo(i.multiply2().subtract(3)) >= 0) {
      return i.add(j).subtract(1);
    }
    if (j.isEven()) {
      return k(i.subtract(1), i.subtract(j.add(2).divide2()));
    } else {
      return k(i.subtract(1), i.add(j.subtract(1).divide2()));
    }
  }

  @Override
  public Z next() {
    return k(mA.next().add(2), mB.next());
  }
}

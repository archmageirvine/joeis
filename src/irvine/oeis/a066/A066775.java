package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A066775 Primes p such that 2*p^2 is not in A066721.
 * @author Sean A. Irvine
 */
public class A066775 extends A000040 {

  private final Sequence mSeq = new A066721();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.square().multiply2();
      while (mA.compareTo(t) < 0) {
        mA = mSeq.next();
      }
      if (!mA.equals(t)) {
        return p;
      }
    }
  }
}


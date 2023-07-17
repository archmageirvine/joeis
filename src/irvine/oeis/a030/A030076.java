package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054055;

/**
 * A030076 a(n) = 10 - m, where m = maximal digit of n.
 * @author Sean A. Irvine
 */
public class A030076 extends Sequence1 {

  private final Sequence mSeq = new A054055().skip();

  @Override
  public Z next() {
    return Z.TEN.subtract(mSeq.next());
  }
}


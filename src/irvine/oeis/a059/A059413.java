package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027375;

/**
 * A059413 Number of distinct languages accepted by unary DFA's with n states.
 * @author Sean A. Irvine
 */
public class A059413 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Sequence seq = new A027375();
    seq.next();
    return Integers.SINGLETON.sum(1, ++mN, k -> seq.next().shiftLeft(mN - k));
  }
}

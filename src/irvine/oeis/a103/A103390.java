package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A103390 Natural numbers but with nonprimes squared.
 * @author Georg Fischer
 */
public class A103390 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.isPrime() ? n : n.square();
  }
}

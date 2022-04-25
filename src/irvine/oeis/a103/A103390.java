package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A103390 Natural numbers but with nonprimes squared.
 * @author Georg Fischer
 */
public class A103390 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.isPrime() ? n : n.square();
  }
}

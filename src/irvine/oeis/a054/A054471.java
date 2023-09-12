package irvine.oeis.a054;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a006.A006556;

/**
 * A054471 Smallest prime p having n different cycles in decimal expansions of k/p, k=1..p-1.
 * @author Sean A. Irvine
 */
public class A054471 extends InverseSequence {

  /** Construct the sequence. */
  public A054471() {
    super(new A006556(), 1, 3);
  }

  @Override
  public Z next() {
    final Z res = Puma.primeZ(super.next());
    return Z.FIVE.equals(res) ? Z.THREE : res;
  }
}

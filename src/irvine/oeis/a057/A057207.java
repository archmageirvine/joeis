package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a124.A124984;

/**
 * A057207 a(1)=5, a(n) is the smallest prime dividing 4*Q^2 + 1 where Q is the product of all previous terms in the sequence.
 * @author Sean A. Irvine
 */
public class A057207 extends A124984 {

  /** Construct the sequence. */
  public A057207() {
    super(1, Z.FIVE, 1, 0, q -> q.square().multiply(4).add(1));
  }
}

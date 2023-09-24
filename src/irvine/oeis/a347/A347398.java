package irvine.oeis.a347;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A347398 Expansion of g.f. Sum_{k&gt;=1} k^k * x^(k^k)/(1 - x^(k^k)).
 * @author Georg Fischer
 */
public class A347398 extends DifferenceSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A347398() {
    super(1, new A347397());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}

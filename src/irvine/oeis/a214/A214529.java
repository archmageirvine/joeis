package irvine.oeis.a214;
// Generated by gen_seq4.pl m1pow/m1mul at 2023-06-04 18:45

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a208.A208546;

/**
 * A214529 Expansion of f(x^29, -x^31) - x * f(x^19, -x^41) + x^3 * f(x^11, -x^49) - x^7 * f(-x, x^59) in powers of x where f() is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A214529 extends AbstractSequence {

  private int mN = -1;
  private final A208546 mSeq = new A208546();

  /** Construct the sequence. */
  public A214529() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(((mN & 1) == 0) ? 1 : -1);
  }
}

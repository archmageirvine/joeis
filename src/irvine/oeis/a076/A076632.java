package irvine.oeis.a076;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a077.A077020;

/**
 * A076632 Solve 2^n - 2 = 7(x^2 - x) + (y^2 - y) for (x,y) with x&gt;0, y&gt;0; sequence gives value of x.
 * @author Georg Fischer
 */
public class A076632 extends AbstractSequence {

  private final AbstractSequence mSeq = new A077020();

  /** Construct the sequence. */
  public A076632() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2().add(1);
  }
}

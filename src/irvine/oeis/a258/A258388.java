package irvine.oeis.a258;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A258388 a(n) = n^(n+1) + (n-1)^n.
 * @author Georg Fischer
 */
public class A258388 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A258388() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 1) ? Z.ONE : Z.valueOf(mN).pow(mN + 1).add(Z.valueOf(mN - 1).pow(mN));
  }
}

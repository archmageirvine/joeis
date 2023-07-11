package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A113062 Expansion of theta series of hexagonal net with respect to a node.
 * @author Georg Fischer
 */
public class A113062 extends InverseMobiusTransformSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A113062() {
    super(0, new PeriodicSequence(3, -3, 3, 3, -3, -3, 3, -3, 0), 0);
    super.next();
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : super.next();
  }
}

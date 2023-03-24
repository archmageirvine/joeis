package irvine.oeis.a337;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a336.A336662;

/**
 * A337353 Number of n-step self-avoiding walks on a square lattice where no step can be in the same direction as the previous step.
 * @author Georg Fischer
 */
public class A337353 extends AbstractSequence {

  private int mN = -1;
  private final A336662 mSeq = new A336662();

  /** Construct the sequence. */
  public A337353() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.FOUR.multiply(mSeq.next());
  }
}

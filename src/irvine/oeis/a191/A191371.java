package irvine.oeis.a191;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000685;

/**
 * A191371 Number of simple labeled graphs with (at most) 3-colored nodes such that no edge connects two nodes of the same color.
 * @author Georg Fischer
 */
public class A191371 extends AbstractSequence {

  private int mN = -1;
  private final A000685 mSeq = new A000685();

  /** Construct the sequence. */
  public A191371() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.THREE.multiply(mSeq.next());
  }
}

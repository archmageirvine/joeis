package irvine.oeis.a073;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a036.A036987;
import irvine.oeis.transform.RootSequence;

/**
 * A073267 Number of compositions (ordered partitions) of n into exactly two powers of 2.
 * @author Georg Fischer
 */
public class A073267 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A073267() {
    super(0, new SkipSequence(new A036987(), 1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}


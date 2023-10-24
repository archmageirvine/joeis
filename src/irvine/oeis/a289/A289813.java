package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A289813 A binary encoding of the ones in ternary representation of n (see Comments for precise definition).
 * @author Georg Fischer
 */
public class A289813 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A289813() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return new Z(Integer.toString(++mN, 3).replace('2', '0'), 2);
  }
}

package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A289814 A binary encoding of the twos in ternary representation of n (see Comments for precise definition).
 * @author Georg Fischer
 */
public class A289814 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A289814() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return new Z(n.toString(3).replace('1', '0').replace('2', '1'), 2);
  }

  @Override
  public Z a(final int n) {
    return new Z(Integer.toString(n, 3).replace('1', '0').replace('2', '1'), 2);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}


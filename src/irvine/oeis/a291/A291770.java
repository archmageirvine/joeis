package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A291770 A binary encoding of the zeros in ternary representation of n.
 * @author Georg Fischer
 */
public class A291770 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A291770() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return new Z(Integer.toString(++mN, 3).replace('0', '_').replaceAll("[12]", "0").replace('_', '1'), 2);
  }
}

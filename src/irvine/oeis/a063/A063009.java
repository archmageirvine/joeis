package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063009 Write n in binary then square as if written in base 10.
 * @author Georg Fischer
 */
public class A063009 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A063009() {
    mN = -1;
  }

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).toString(2)).square();
  }
}

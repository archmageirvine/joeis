package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a051.A051168;

/**
 * A011796 Number of irreducible alternating Euler sums of depth 6 and weight 6+2n.
 * @author Sean A. Irvine
 */
public class A011796 extends A051168 {

  /** Construct the sequence. */
  public A011796() {
    super(1);
  }

  protected long mN = 6;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}

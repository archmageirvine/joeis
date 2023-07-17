package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a058.A058876;

/**
 * A060335 Number of n-node labeled acyclic digraphs with 3 out-points.
 * @author Sean A. Irvine
 */
public class A060335 extends A058876 {

  /** Construct the sequence. */
  public A060335() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}

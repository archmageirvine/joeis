package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007049 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007049 extends A007048 {

  /** Construct the sequence. */
  public A007049() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}

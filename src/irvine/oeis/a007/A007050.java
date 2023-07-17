package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007050 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007050 extends A007048 {

  /** Construct the sequence. */
  public A007050() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}

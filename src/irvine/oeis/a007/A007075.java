package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007075 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007075 extends A007046 {

  /** Construct the sequence. */
  public A007075() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}

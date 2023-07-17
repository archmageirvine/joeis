package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007076 Number of irreducible positions of size n in Montreal solitaire.
 * @author Sean A. Irvine
 */
public class A007076 extends A007046 {

  /** Construct the sequence. */
  public A007076() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}

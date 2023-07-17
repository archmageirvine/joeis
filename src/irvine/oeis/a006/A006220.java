package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006220 From descending subsequences of permutations.
 * @author Sean A. Irvine
 */
public class A006220 extends A006219 {

  /** Construct the sequence. */
  public A006220() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}

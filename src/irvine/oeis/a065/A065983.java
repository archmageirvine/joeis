package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a070.A070250;

/**
 * A065983 Palindromes whose digit sum is 4.
 * @author Sean A. Irvine
 */
public class A065983 extends A070250 {

  /** Construct the sequence. */
  public A065983() {
    super(4);
  }

  @Override
  protected boolean accept(final Z t) {
    return true;
  }
}

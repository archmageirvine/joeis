package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a079.A079000;

/**
 * A080731 a(1)=1; a(2)=6; for n &gt; 2, a(n) is taken as the smallest positive integer greater than a(n-1) such that the condition "n is a member of the sequence if and only if a(n) is odd" is satisfied.
 * @author Sean A. Irvine
 */
public class A080731 extends A079000 {

  /** Construct the sequence. */
  public A080731() {
    super(1, 1, 0, Z::isOdd);
  }

  @Override
  protected Z special(final int n) {
    return n == 2 ? Z.SIX : null;
  }
}

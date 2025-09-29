package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a079.A079000;

/**
 * A080752 a(1)=1; a(2)=8; for n &gt; 2, a(n) is smallest integer greater than a(n-1) that satisfies the condition "n is in the sequence if and only if a(n) is odd.".
 * @author Sean A. Irvine
 */
public class A080752 extends A079000 {

  /** Construct the sequence. */
  public A080752() {
    super(1, 1, 0, Z::isOdd);
  }

  @Override
  protected Z special(final int n) {
    return n == 2 ? Z.EIGHT : null;
  }
}

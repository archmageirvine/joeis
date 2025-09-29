package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a079.A079000;

/**
 * A080703 a(1)=5; for n&gt;1, a(n) = smallest number &gt; a(n-1) such that the condition "if n is in the sequence then a(n) is a multiple of 4" is satisfied.
 * @author Sean A. Irvine
 */
public class A080703 extends A079000 {

  /** Construct the sequence. */
  public A080703() {
    super(1, 5, 0, n -> n.mod(4) == 0);
  }

  @Override
  protected Z special(final int n) {
    return n == 4 ? Z.EIGHT : null;
  }
}

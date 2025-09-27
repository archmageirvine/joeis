package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a079.A079000;

/**
 * A080633
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

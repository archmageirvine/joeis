package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013963;

/**
 * A058552 Numerators of q-expansion of Eisenstein series E_16(q).
 * @author Sean A. Irvine
 */
public class A058552 extends A013963 {

  /** Construct the sequence. */
  public A058552() {
    super(0);
  }

  private static final Q C = new Q(16320, 3617);
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return C.multiply(super.next()).num();
  }
}

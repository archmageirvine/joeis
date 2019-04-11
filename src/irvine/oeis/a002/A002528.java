package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a188.A188491;

/**
 * A002528 <code>a(n) =</code> A188491(n+1) - A188494(n) - A002526(n).
 * @author Sean A. Irvine
 */
public class A002528 extends A002527 {

  private final Sequence mA188491 = new A188491();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().add(mA188491.next());
  }
}

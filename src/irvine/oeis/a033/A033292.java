package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a143.A143689;

/**
 * A033292 A Connell-like sequence: take 1 number <code>= 1 (mod Q), 2</code> numbers <code>= 2 (mod Q), 3</code> numbers <code>= 3 (mod Q)</code>, etc., where Q <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A033292 extends A143689 {

  private long mN = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
      mT = super.next();
    } else {
      mT = mT.add(3);
    }
    return mT;
  }
}


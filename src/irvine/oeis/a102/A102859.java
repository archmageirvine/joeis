package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.a061.A061457;

/**
 * A102859 Numbers that when squared and written backwards give a square again.
 * @author Sean A. Irvine
 */
public class A102859 extends A061457 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}


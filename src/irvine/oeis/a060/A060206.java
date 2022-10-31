package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000682;

/**
 * A060206 Number of rotationally symmetric closed meanders of length 4n+2.
 * @author Sean A. Irvine
 */
public class A060206 extends A000682 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

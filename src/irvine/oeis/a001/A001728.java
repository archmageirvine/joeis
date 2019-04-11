package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000813;

/**
 * A001728 Expansion of cos <code>x /</code> cos <code>4x</code>.
 * @author Sean A. Irvine
 */
public class A001728 extends A000813 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

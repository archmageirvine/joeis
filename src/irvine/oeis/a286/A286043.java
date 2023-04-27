package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.a285.A285658;

/**
 * A286043 (1/2)*A285658.
 * @author Georg Fischer
 */
public class A286043 extends A285658 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

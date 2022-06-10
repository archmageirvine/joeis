package irvine.oeis.a112;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a006.A006967;

/**
 * A112362 A006967(n)/2.
 * @author Georg Fischer
 */
public class A112362 extends A006967 {

  /** Construct the sequence. */
  public A112362() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

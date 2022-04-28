package irvine.oeis.a161;
// manually deris/essent at 2022-04-28 12:39

import irvine.math.z.Z;
import irvine.oeis.a141.A141468;

/**
 * A161753 Squares of nonprime numbers A141468.
 * @author Georg Fischer
 */
public class A161753 extends A141468 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

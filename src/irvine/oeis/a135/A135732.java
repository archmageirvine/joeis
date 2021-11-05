package irvine.oeis.a135;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a046.A046933;

/**
 * A135732 Distances to next prime associated with A135731.
 * Essentially the same as A046933.
 * @author Georg Fischer
 */
public class A135732 extends A046933 {

  private int mN = 0;

  /** Construct the sequence. */
  public A135732() {
    super.next();
    super.next();
  }
  
  @Override
  public Z next() {
    return ++mN == 1 ? Z.TWO : super.next();
  }
}

package irvine.oeis.a077;
// manually deris/essent at 2022-04-27 19:28

import irvine.math.z.Z;
import irvine.oeis.a001.A001607;

/**
 * A077020 a(n) is the unique odd positive solution x of 2^n = 7x^2+y^2.
 * @author Georg Fischer
 */
public class A077020 extends A001607 {

  /** Construct the sequence. */
  public A077020() {
    skip(1);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}

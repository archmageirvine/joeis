package irvine.oeis.a080;
// manually 2021-08-04

import irvine.oeis.a051.A051037;

/**
 * A080681 17-smooth numbers: numbers whose prime divisors are all &lt;= 17.
 * @author Georg Fischer
 */
public class A080681 extends A051037 {

  /** Construct the sequence */
  public A080681() {
    super(new int[] { 2, 3, 5, 7, 11, 13, 17 });
  }
}

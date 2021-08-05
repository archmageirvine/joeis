package irvine.oeis.a080;
// manually 2021-08-04

import irvine.oeis.a051.A051037;

/**
 * A080683 19-smooth numbers: numbers whose prime divisors are all <= 23.
 * @author Georg Fischer
 */
public class A080683 extends A051037 {

  /** Construct the sequence */
  public A080683() {
    super(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23 });
  }
}

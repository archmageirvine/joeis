package irvine.oeis.a217;

import irvine.oeis.FiniteSequence;

/**
 * A217660 Numbers that give records for f(n)= (log(d(n))*log(log(n)))/(log(2)*log(n)) with d(n) the number of divisors.
 * @author Georg Fischer
 */
public class A217660 extends FiniteSequence {

  /** Construct the sequence. */
  public A217660() {
    super(1, FINITE, 2, 3, 4, 6, 8, 10, 12, 18, 24, 36, 48, 60, 120, 180, 240, 360, 720, 840, 1260, 1680, 2520, 5040, 10080, 15120, 27720, 55440, 110880, 166320, 332640, 720720, 1441440, 2162160, 4324320, 21621600, 367567200L, 6983776800L);
  }
}

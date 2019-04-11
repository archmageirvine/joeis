package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079042 Numbers n in which the first k digits of n form an integer divisible by <code>k^2,</code> for <code>k = 1, 2, ...,</code> m, where m is the number of digits in n.
 * @author Georg Fischer
 */
public class A079042 extends FiniteSequence {

  /** Construct the sequence. */
  public A079042() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, 126, 162, 207, 243, 288, 324, 360, 369, 405, 441, 486, 522, 567, 603, 648, 684, 720, 729, 765, 801, 846, 882, 927, 963, 1264, 2432, 2880, 3248, 3600, 3696);
  }
}

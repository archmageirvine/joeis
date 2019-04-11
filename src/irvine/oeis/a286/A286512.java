package irvine.oeis.a286;

import irvine.oeis.FiniteSequence;

/**
 * A286512 Numbers N for which there is <code>k &gt; 0</code> such that sum of digits(N^k) = N, but the least such k is larger than the least k for which sum of digits(N^k) &gt; N*11/10.
 * @author Georg Fischer
 */
public class A286512 extends FiniteSequence {

  /** Construct the sequence. */
  public A286512() {
    super(17, 31, 63, 86, 91, 103, 118, 133, 155, 157, 211, 270, 290, 301, 338, 352, 421, 432, 440, 441, 450, 478, 513, 533, 693, 853, 1051, 1237, 1363, 1459, 1526, 1665, 2781);
  }
}

package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178884 <code>a(n) =</code> number of 9-digit primes with digit sum n, where n runs through the non-multiples of 3 in the range <code>[2..80]</code>.
 * @author Georg Fischer
 */
public class A178884 extends FiniteSequence {

  /** Construct the sequence. */
  public A178884() {
    super(0, 2, 26, 226, 372, 1457, 3312, 9159, 13320, 32077, 50752, 102027, 138554, 249053, 331920, 535444, 655423, 966278, 1152057, 1546854, 1751100, 2168566, 2374001, 2719026, 2850784, 3029814, 3063907, 3019100, 2943918, 2691740, 2519884, 2134422, 1930862, 1511648, 1303187, 935353, 783315, 514221, 402227, 238252, 182466, 97415, 66012, 30140, 21162, 8438, 4350, 1311, 906, 170, 65, 3, 1);
  }
}

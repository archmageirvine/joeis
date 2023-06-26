package irvine.oeis.a051;
// manually finifull at 2021-09-21 20:24

import irvine.oeis.FiniteSequence;

/**
 * A051992 Discriminants of real quadratic fields of ERD-type with class groups of exponent 2 and discriminants of the form D = r^2*k^2+4k, k odd.
 * @author Georg Fischer
 */
public class A051992 extends FiniteSequence {

  /** Construct the sequence. */
  public A051992() {
    super(1, FINITE, 85, 165, 205, 221, 285, 357, 365, 429, 533, 629, 645, 741, 957, 965, 1085, 1205, 1245, 1365, 1469, 
        1517, 1533, 1685, 1853, 1965, 2013, 2037, 2045, 2085, 2373, 2397, 2405, 2613, 2805, 2813, 3005, 3045, 
        3237, 3485, 3885, 3965, 4245, 4277, 4485, 4773, 5565, 5645, 5885, 5957, 6573, 7157, 7293, 7565, 7685, 
        7917, 8333, 8645, 9005, 9933, 10205, 10965, 11165, 13845, 14685, 15645, 16133, 16653, 17765, 18245, 
        20405, 21045, 23205, 24045, 25493, 26565, 30597, 31317, 32045, 35805, 41093, 55205, 74613);
  }
}

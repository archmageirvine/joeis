package irvine.oeis.a092;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A092203 Molien series for 16-dimensional group of structure 2^4.O_{4}^{+}(F_2) = 2^4.(S_3 X S_3).2 and order 1152, corresponding to genus 2 complete weight enumerators of Hermitian self-dual GF(2)-linear codes over GF(4) containing the all-ones vector.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A092203 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092203() {
    super(0, "[1, 0, 0, 1, 5, 18, 45, 88, 196, 394, 804, 1512, 2702, 4529, 7218, 11019, 16064, 22609, 30555, 39889, 50303, 61476, 72888, 84047, 94299, 102995, 109674, 113791, 115228, 113791, 109674, 102995, 94299, 84047, 72888, 61476, 50303, 39889, 30555, 22609, 16064, 11019, 7218, 4529, 2702, 1512, 804, 394, 196, 88, 45, 18, 5, 1, 0, 0, 1]", "[1, -1, -2, -1, -2, 11, 8, 1, -12, -37, -2, 11, 50, 43, -30, -25, -67, 12, 30, 6, 28, -50, 42, 8, 7, 1, -58, 37, -18, 5, -38, -35, 71, 76, 50, -62, -116, -62, 50, 76, 71, -35, -38, 5, -18, 37, -58, 1, 7, 8, 42, -50, 28, 6, 30, 12, -67, -25, -30, 43, 50, 11, -2, -37, -12, 1, 8, 11, -2, -1, -2, -1, 1]");
  }
}

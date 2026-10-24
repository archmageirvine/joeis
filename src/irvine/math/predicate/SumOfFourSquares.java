package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a sum of four squares.
 * @author Sean A. Irvine
 */
public class SumOfFourSquares extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    int s = 0;
    while (!n.testBit(s) && !n.testBit(s + 1)) {
      s += 2;
    }
    return n.shiftRight(s).mod(8) == 7;
  }
}

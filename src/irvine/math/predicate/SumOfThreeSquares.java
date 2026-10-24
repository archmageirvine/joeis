package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is a sum of three squares.
 * @author Sean A. Irvine
 */
public class SumOfThreeSquares extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1 && p.mod(4) == 3) {
        int s = 0;
        while (!n.testBit(s) && !n.testBit(s + 1)) {
          s += 2;
        }
        return n.shiftRight(s).mod(8) != 7;
      }
    }
    return false;
  }
}

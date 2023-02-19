package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A061493 Roman numerals written using 1 for I, 2 for V, 3 for X, 4 for L, 5 for C, 6 for D, 7 for M.
 * @author Sean A. Irvine
 */
public class A061493 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String roman = Roman.roman(++mN);
    Z res = Z.ZERO;
    for (int k = 0; k < roman.length(); ++k) {
      res = res.multiply(10);
      switch (roman.charAt(k)) {
        case 'I':
          res = res.add(1);
          break;
        case 'V':
          res = res.add(2);
          break;
        case 'X':
          res = res.add(3);
          break;
        case 'L':
          res = res.add(4);
          break;
        case 'C':
          res = res.add(5);
          break;
        case 'D':
          res = res.add(6);
          break;
        case 'M':
          res = res.add(7);
          break;
        default:
          throw new RuntimeException();
      }
    }
    return res;
  }
}


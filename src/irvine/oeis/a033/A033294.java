package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A033294 Squares which when written backwards remain square (final <code>0</code>'s excluded).
 * @author Sean A. Irvine
 */
public class A033294 extends A000290 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (square.mod(10) != 0 && ZUtils.reverse(square).isSquare()) {
        return square;
      }
    }
  }
}


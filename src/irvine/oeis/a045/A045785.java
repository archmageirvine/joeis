package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045785 Squares with initial digit '2'.
 * @author Sean A. Irvine
 */
public class A045785 implements Sequence {

  private Z mN = Z.ZERO;

  protected String prefix() {
    return "2";
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (square.toString().startsWith(prefix())) {
        return square;
      }
    }
  }
}


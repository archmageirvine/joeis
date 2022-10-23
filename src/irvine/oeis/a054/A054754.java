package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054754 Totient(n) and cototient(n) are squares.
 * @author Georg Fischer
 */
public class A054754 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z nn = Z.valueOf(++mN);
      final Z nPhi = Jaguar.factor(nn).phi();
      if (nPhi.isSquare() && nn.subtract(nPhi).isSquare()) {
        return nn;
      }
    }
  }
}

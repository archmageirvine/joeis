package irvine.oeis.a333;

import irvine.math.BinaryLambdaCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333958 Number of closed binary lambda terms of size n with a normal form.
 * @author Gregory Morse
 */
public class A333958 extends Sequence1 {

  private int mN;

  @Override
  public Z next() {
    switch (++mN) {
      // Regenerate these slow rows with BinaryLambdaCensus --maximum n.
      case 34:
        return Z.valueOf(3278660);
      case 35:
        return Z.valueOf(5961402);
      case 36:
        return Z.valueOf(11112179);
      default:
        return Z.valueOf(BinaryLambdaCensus.normalizingCount(mN));
    }
  }
}

package irvine.oeis.a333;

import irvine.math.BinaryLambdaCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333958 The number of closed lambda calculus terms of size n that have a normal form, where size(lambda M)=2+size(M), size(M N)=2+size(M)+size(N), and size(V)=1+i for a variable V bound by the i-th enclosing lambda.
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

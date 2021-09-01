package irvine.oeis.a185;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A185592 a(n) = floor(n^(3/2)) * floor(1 + n^(3/2)) * floor(2 + n^(3/2))/6.
 * @author Georg Fischer
 */
public class A185592 extends FloorSequence {

  /** Construct the sequence */
  public A185592() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    final CR n32 = CR.valueOf(n).pow(3).sqrt();
    return n32.floor().multiply(n32.add(CR.ONE).floor()).multiply(n32.add(CR.TWO).floor()).divide(6);
  }

}

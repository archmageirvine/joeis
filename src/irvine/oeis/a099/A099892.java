package irvine.oeis.a099;
// manually mult at 2022-07-21 15:13

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.PrependSequence;

/**
 * A099892 XOR BINOMIAL transform of A003188 (Gray code numbers); also the main diagonal of the XOR difference triangle A099891.
 * @author Georg Fischer
 */
public class A099892 extends PrependSequence {

  /** Construct the sequence. */
  public A099892() {
    super(new MultiplicativeSequence(0,  (p,  e) -> p.equals(Z.TWO) ? Z.ONE.shiftLeft(e - 1).multiply(3) : Z.ZERO).skip(1), 0);
  }
}

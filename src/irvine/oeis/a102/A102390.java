package irvine.oeis.a102;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A102390 An odious count.
 * @author Georg Fischer
 */
public class A102390 extends LambdaSequence {

  /** Construct the sequence. */
  public A102390() {
    super(0, n -> Z.valueOf(1 + n / 2).multiply(1 - (Functions.THUE_MORSE.z(n).testBit(0) ? -1 : 1)).divide(2));
  }
}

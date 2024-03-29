package irvine.oeis.a364;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 15:09

import irvine.math.z.Z;
import irvine.oeis.a036.A036291;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A364881 First significant digit of the decimal expansion of n/(2^n).
 * @author Georg Fischer
 */
public class A364881 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A364881() {
    super(1, new A036291(), v -> Z.valueOf(v.toString().charAt(0) - '0'));
    super.next();
  }
}

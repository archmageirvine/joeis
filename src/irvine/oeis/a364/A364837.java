package irvine.oeis.a364;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.z.Z;
import irvine.oeis.a001.A001146;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A364837 Initial digit of 2^(2^n) = A001146(n).
 * @author Georg Fischer
 */
public class A364837 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A364837() {
    super(0, new A001146(), v -> Z.valueOf(v.toString().charAt(0) - '0'));
  }
}

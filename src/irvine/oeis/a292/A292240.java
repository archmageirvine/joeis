package irvine.oeis.a292;
// Generated by gen_seq4.pl 2024-01-16/simtraf at 2024-01-19 19:57

import irvine.math.z.Z;
import irvine.oeis.a254.A254103;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A292240 Binary encoding of 0-digits in ternary representation of A254103(n).
 * @author Georg Fischer
 */
public class A292240 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A292240() {
    super(0, new A254103(), (n, v) -> (n == 0) ? Z.ZERO : new Z(v.toString(3).replaceAll("[12]", "x").replaceAll("0", "1").replaceAll("x", "0"), 2));
  }
}

package irvine.oeis.a305;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a007.A007089;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A305877 Numbers in base 3 reversed.
 * @author Georg Fischer
 */
public class A305877 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A305877() {
    super(0, new A007089(), v -> Functions.REVERSE.z(v));
  }
}

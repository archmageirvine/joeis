package irvine.oeis.a111;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a016.A016777;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A111295 Number of partitions of 3n+1.
 * @author Georg Fischer
 */
public class A111295 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A111295() {
    super(0, new A016777(), Functions.PARTITIONS::z);
  }
}

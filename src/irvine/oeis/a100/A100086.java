package irvine.oeis.a100;
// Generated by gen_seq4.pl 2023-10-12/simtraf at 2023-10-12 23:13

import irvine.oeis.a144.A144211;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100086 Decimal expansion of unique positive solution to y^y = (y-1)^(y+1).
 * @author Georg Fischer
 */
public class A100086 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A100086() {
    super(1, new A144211(), (k, v) -> (k == 1) ? v.add(1) : v);
  }
}

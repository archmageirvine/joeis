package irvine.oeis.a081;
// Generated by gen_seq4.pl 2023-12-08/filtpos at 2023-12-08 18:44

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001006;

/**
 * A081706 Numbers n such that binary representation ends either in an odd number of ones followed by one zero or in an even number of ones.
 * @author Georg Fischer
 */
public class A081706 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081706() {
    super(1, 0, new A001006(), EVEN);
  }
}

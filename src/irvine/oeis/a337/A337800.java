package irvine.oeis.a337;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003586;
import irvine.oeis.a003.A003592;

/**
 * A337800 Numbers of the form (2^i)*(3^j) or (2^i)*(5^j).
 * @author Georg Fischer
 */
public class A337800 extends UnionSequence {

  /** Construct the sequence. */
  public A337800() {
    super(new A003586(), new A003592());
  }
}

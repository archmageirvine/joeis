package irvine.oeis.a258;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003586;
import irvine.oeis.a003.A003593;

/**
 * A258023 Numbers of form (2^i)*(3^j) or (3^i)*(5^j).
 * @author Georg Fischer
 */
public class A258023 extends UnionSequence {

  /** Construct the sequence. */
  public A258023() {
    super(new A003586(), new A003593());
  }
}

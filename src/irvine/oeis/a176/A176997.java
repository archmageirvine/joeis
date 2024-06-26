package irvine.oeis.a176;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001567;
import irvine.oeis.a006.A006005;

/**
 * A176997 Integers k such that 2^(k-1) == 1 (mod k).
 * @author Georg Fischer
 */
public class A176997 extends UnionSequence {

  /** Construct the sequence. */
  public A176997() {
    super(new A006005(), new A001567());
  }
}

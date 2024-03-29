package irvine.oeis.a268;
// Generated by gen_seq4.pl unionm/union2 at 2023-08-15 07:12

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a006.A006882;

/**
 * A268645 Union of the factorial numbers (A000142) and the double factorials numbers (A006882).
 * @author Georg Fischer
 */
public class A268645 extends UnionSequence {

  /** Construct the sequence. */
  public A268645() {
    super(1, new A000142(), new A006882());
  }
}

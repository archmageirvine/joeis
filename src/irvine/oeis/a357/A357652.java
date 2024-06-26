package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a001.A001246;
import irvine.oeis.a129.A129123;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A357652 Number of pairs of Dyck paths of semilength n such that the midpoint of the first is not below the midpoint of the second.
 * @author Georg Fischer
 */
public class A357652 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A357652() {
    super(0, (n, s) -> s[0].add(s[1]).divide(2), "", new A001246(), new A129123());
  }
}

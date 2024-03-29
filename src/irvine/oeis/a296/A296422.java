package irvine.oeis.a296;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000668;
import irvine.oeis.a121.A121326;

/**
 * A296422 Primes that can be represented in the form b^n+1 or b^n-1 where b &gt;= 2 and n &gt;= 2.
 * @author Georg Fischer
 */
public class A296422 extends UnionSequence {

  /** Construct the sequence. */
  public A296422() {
    super(new A000668(), new A121326());
  }
}

package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a190.A190833;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A322126 Number of permutations of the multiset {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,...,n,n,n,n,n} with no two consecutive terms equal.
 * @author Georg Fischer
 */
public class A322126 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A322126() {
    super(0, new A190833(), (n, v) -> Functions.FACTORIAL.z(n).multiply(v));
  }
}

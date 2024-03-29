package irvine.oeis.a157;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a001.A001615;
import irvine.oeis.a060.A060594;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A157223 Number of primitive inequivalent oblique sublattices of centered rectangular lattice of index n.
 * @author Georg Fischer
 */
public class A157223 extends PairTransformSequence {

  /** Construct the sequence. */
  public A157223() {
    super(1, new A001615(), new A060594(), (n, u, v) -> u.subtract(v).divide2());
  }
}

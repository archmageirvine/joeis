package irvine.oeis.a195;

import irvine.oeis.FiniteSequence;

/**
 * A195166 Numbers expressible as 2^a - 2^b, with 0 &lt;= b &lt; a, such that n^a - n^b is divisible by 2^a - 2^b for all n.
 * @author Georg Fischer
 */
public class A195166 extends FiniteSequence {

  /** Construct the sequence. */
  public A195166() {
    super(1, 2, 6, 12, 30, 24, 60, 120, 252, 240, 504, 16380, 32760, 65520);
  }
}

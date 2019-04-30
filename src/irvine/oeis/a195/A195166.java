package irvine.oeis.a195;

import irvine.oeis.FiniteSequence;

/**
 * A195166 Numbers expressible as <code>2^a-2^b</code>, with <code>0 &lt;= b&lt; a</code>, such that <code>n^a-n^b</code> is divisible by <code>2^a-2^b</code> for all n.
 * @author Georg Fischer
 */
public class A195166 extends FiniteSequence {

  /** Construct the sequence. */
  public A195166() {
    super(1, 2, 6, 12, 30, 24, 60, 120, 252, 240, 504, 16380, 32760, 65520);
  }
}

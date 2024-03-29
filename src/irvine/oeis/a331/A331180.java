package irvine.oeis.a331;
// Generated by gen_seq4.pl A081373/ordtraf at 2023-10-03 19:26

import irvine.oeis.a323.A323910;
import irvine.oeis.transform.OrdinalTransformSequence;

/**
 * A331180 Number of values of k, 1 &lt;= k &lt;= n, with A323910(k) = A323910(n), where A323910 is Dirichlet inverse of deficiency of n.
 * @author Georg Fischer
 */
public class A331180 extends OrdinalTransformSequence {

  /** Construct the sequence. */
  public A331180() {
    super(1, new A323910());
  }
}


package irvine.oeis.a050;
// Generated by gen_seq4.pl serrevas at 2021-05-02 19:34
// DO NOT EDIT here!

import irvine.oeis.a008.A008836;
import irvine.oeis.transform.RevertTransformSequence;


/**
 * A050387 Reversion of Liouville's lambda function A008836.
 * @author Georg Fischer
 */
public class A050387 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A050387() {
    super(new A008836());
  }
}

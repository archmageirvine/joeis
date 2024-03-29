package irvine.oeis.a291;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a278.A278222;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A291771 Filter based on runlengths of 0-digits in base-3 expansion of n: a(n) = A278222(A291770(n)).
 * @author Georg Fischer
 */
public class A291771 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A291771() {
    super(1, new A278222(), new A291770());
  }
}

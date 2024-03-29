package irvine.oeis.a194;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a014.A014980;
import irvine.oeis.a055.A055642;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A194079 Number of digits of A014980(n) in decimal representation.
 * @author Georg Fischer
 */
public class A194079 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A194079() {
    super(0, new A055642(), new A014980());
  }
}

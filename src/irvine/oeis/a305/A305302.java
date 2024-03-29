package irvine.oeis.a305;
// Generated by gen_seq4.pl 2024-02-22/rgs1 at 2024-02-22 22:36

import irvine.oeis.a278.A278222;
import irvine.oeis.a291.A291760;
import irvine.oeis.transform.DirectTransformSequence;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A305302 Restricted growth sequence transform of A278222(A291760(n)), constructed from runlengths of 2-digits in base-3 representation of A254103(n).
 * @author Georg Fischer
 */
public class A305302 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A305302() {
    super(0, new DirectTransformSequence(0, new A278222(), new A291760()));
  }
}

package irvine.oeis.a159;
// Generated by gen_seq4.pl 2023-11-28/simtraf at 2023-11-29 22:39

import irvine.oeis.a102.A102370;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A159067 A102370(n) modulo 9 .
 * @author Georg Fischer
 */
public class A159067 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A159067() {
    super(0, new A102370(), v -> v.modZ(9));
  }
}

package irvine.oeis.a159;
// Generated by gen_seq4.pl robots/partsum at 2023-09-04 09:14

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A159912 Partial sums of A159913(k) = 2^bitcount(2k+1)-1 = A038573(2k+1), bitcount=A000120.
 * @author Georg Fischer
 */
public class A159912 extends PrependSequence {

  /** Construct the sequence. */
  public A159912() {
    super(0, new PartialSumSequence(0, new A159913()), 0);
  }
}

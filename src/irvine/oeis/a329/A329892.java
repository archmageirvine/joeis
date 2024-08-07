package irvine.oeis.a329;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A329892 a(0) = 0, a(1) = 1, for n &gt; 1, a(n) = 2^(n+1) - 3*(sigma((2^n)-1) - sigma((2^(n-1))-1)).
 * @author Georg Fischer
 */
public class A329892 extends LambdaSequence {

  private static final DirectSequence A329644 = new A329644();

  /** Construct the sequence. */
  public A329892() {
    super(0, n -> A329644.a(Z.THREE.pow(Z.valueOf(n))));
  }
}

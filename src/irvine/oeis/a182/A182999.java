package irvine.oeis.a182;
// Generated by gen_seq4.pl zbasex at 2021-07-20 16:28

import irvine.math.z.Z;
import irvine.oeis.cons.ZBaseExpansionSequence;


/**
 * A182999 Decimal expansion of c^2, c being the speed of light in vacuum in SI units.
 * @author Georg Fischer
 */
public class A182999 extends ZBaseExpansionSequence {

  /** Construct the sequence. */
  public A182999() {
    super(17, Z.valueOf(299792458L).square());
  }
}

package irvine.oeis.a109;
// Generated by gen_seq4.pl 2023-11-30/simtraf at 2023-12-03 21:34

import irvine.math.z.Z;
import irvine.oeis.a001.A001622;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A109866 9's complement of the digits of the golden ratio phi (A001622): 9.999999999999... - 1.6180339887... = 8.3819660112501051517954131656334...
 * @author Georg Fischer
 */
public class A109866 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A109866() {
    super(1, new A001622(), v -> Z.NINE.subtract(v));
  }
}

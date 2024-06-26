package irvine.oeis.a297;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.a259.A259825;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A297122 a(n) = n^5*H(n) where H() is the Hurwitz class number.
 * @author Georg Fischer
 */
public class A297122 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A297122() {
    super(0, new A259825(), (n, v) -> Z.valueOf(n).pow(5).multiply(v).divide(12));
  }
}

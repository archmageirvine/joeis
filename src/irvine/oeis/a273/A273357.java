package irvine.oeis.a273;
// Generated by gen_seq4.pl A272671/filter at 2023-12-23 22:45

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A273357 Numbers n such that the decimal number concat(2,n) is a square.
 * @author Georg Fischer
 */
public class A273357 extends FilterSequence {

  /** Construct the sequence. */
  public A273357() {
    super(1, new A000027(), v -> new Z("2" + v.toString()).isSquare());
  }
}

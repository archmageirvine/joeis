package irvine.oeis.a192;
// Generated by gen_seq4.pl 2023-11-30/filter at 2023-12-03 21:34

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a061.A061601;

/**
 * A192817 Numbers that are coprime to their 9's complement.
 * @author Georg Fischer
 */
public class A192817 extends FilterSequence {

  /** Construct the sequence. */
  public A192817() {
    super(1, new A000027(), v -> v.gcd(new A061601().a(v)).equals(Z.ONE));
  }
}

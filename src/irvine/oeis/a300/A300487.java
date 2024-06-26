package irvine.oeis.a300;
// Generated by gen_seq4.pl 2023-12-07/filter at 2023-12-07 22:55

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a055.A055120;

/**
 * A300487 Numbers k whose 10's complement mod 10 of their digits is equal to phi(k), the Euler totient function of k.
 * @author Georg Fischer
 */
public class A300487 extends FilterSequence {

  /** Construct the sequence. */
  public A300487() {
    super(1, new A000027(), v -> Functions.PHI.z(v).equals(new A055120().a(v)));
  }
}

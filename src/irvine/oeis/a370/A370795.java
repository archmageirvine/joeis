package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001844;

/**
 * A370795 Centered square numbers which are products of four distinct primes (or tetraprimes).
 * @author Georg Fischer
 */
public class A370795 extends FilterSequence {

  /** Construct the sequence. */
  public A370795() {
    super(1, new A001844(), v -> {
      final FactorSequence fs = Jaguar.factor(v);
      return fs.omega() == 4 && fs.bigOmega() == 4;
    });
  }
}

package irvine.oeis.a091;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a053.A053760;

/**
 * A091382 Distance between the sequence of primes and the largest "mixed" quadratic residues modulo the primes (A091380).
 * @author Georg Fischer
 */
public class A091382 extends PrependSequence {

  /** Construct the sequence. */
  public A091382() {
    super(new A053760().skip(1), 1);
  }
}

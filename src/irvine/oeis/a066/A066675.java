package irvine.oeis.a066;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a035.A035096;

/**
 * A066675 a(n) = A066674(n)-1 divided by the n-th prime.
 * @author Georg Fischer
 */
public class A066675 extends PrependSequence {

  /** Construct the sequence. */
  public A066675() {
    super(1, new A035096(), 1);
  }
}

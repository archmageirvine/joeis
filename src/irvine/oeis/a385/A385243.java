package irvine.oeis.a385;

import irvine.oeis.FilterSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A385243 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A385243 extends PrependSequence {

  /** Construct the sequence. */
  public A385243() {
    super(0, new FilterSequence(new A000040(), p -> p.multiply2().pow(4).add(1).isProbablePrime()), 0, 1);
  }
}

package irvine.oeis.a391;

import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065091;

/**
 * A391049 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A391049 extends FilterSequence {

  /** Construct the sequence. */
  public A391049() {
    super(1, new A065091(), p -> p.subtract(2).isProbablePrime() || p.divide2().isProbablePrime());
  }
}

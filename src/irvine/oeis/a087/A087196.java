package irvine.oeis.a087;

import irvine.oeis.FilterSequence;

/**
 * A087196 Primes of the form 1+(1+p)*p^e, p prime and e&gt;0.
 * @author Sean A. Irvine
 */
public class A087196 extends FilterSequence {

  /** Construct the sequence. */
  public A087196() {
    super(1, new A087195(), PRIME);
  }
}

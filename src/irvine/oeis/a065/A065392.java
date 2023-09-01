package irvine.oeis.a065;

import irvine.oeis.RecordSequence;
import irvine.oeis.a062.A062401;

/**
 * A065392 a(n) = A062401(A065391(n)): phi(sigma(m)) peak values for m's (listed in A065391) at which those peaks are first reached.
 * @author Sean A. Irvine
 */
public class A065392 extends RecordSequence {

  /** Construct the sequence. */
  public A065392() {
    super(new A062401());
  }
}

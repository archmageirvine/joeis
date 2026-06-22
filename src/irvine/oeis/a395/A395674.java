package irvine.oeis.a395;

import irvine.oeis.FilterSequence;
import irvine.oeis.a359.A359280;

/**
 * A395674 Odd powerful numbers that are not powers of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A395674 extends FilterSequence {

  /** Construct the sequence. */
  public A395674() {
    super(1, new A359280(), ODD);
  }
}

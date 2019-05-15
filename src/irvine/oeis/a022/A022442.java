package irvine.oeis.a022;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A022442 <code>a(n) = c(n) + c(n-1)</code> where c is the sequence of numbers not in a.
 * @author Sean A. Irvine
 */
public class A022442 extends PrependSequence {

  /** Construct the sequence. */
  public A022442() {
    super(new SkipSequence(new A022424(2, 4), 3), 2, 4);
  }
}

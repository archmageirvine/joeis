package irvine.oeis.a022;

import irvine.oeis.PrependSequence;

/**
 * A022442 a(n) = c(n) + c(n-1) where c is the sequence of numbers not in a.
 * @author Sean A. Irvine
 */
public class A022442 extends PrependSequence {

  /** Construct the sequence. */
  public A022442() {
    super(new A022424(2, 4).skip(3), 2, 4);
  }
}

package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A060376 If 10^n can be written as x*y where the digits of x and y are all nonzero, then let a(n) = smallest such x, otherwise a(n) = -1.
 * @author Sean A. Irvine
 */
public class A060392 extends PrependSequence {

  /** Construct the sequence. */
  public A060392() {
    super(new SkipSequence(new A060380(), 2), 0, 1);
  }
}

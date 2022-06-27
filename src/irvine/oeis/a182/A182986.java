package irvine.oeis.a182;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;

/**
 * A182986 Zero together with the prime numbers (A000040).
 * @author Sean A. Irvine
 */
public class A182986 extends PrependSequence {

  /** Construct the sequence. */
  public A182986() {
    super(new A000040(), 0);
  }
}

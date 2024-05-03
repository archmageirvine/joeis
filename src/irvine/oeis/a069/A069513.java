package irvine.oeis.a069;

import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010055;

/**
 * A069513 Characteristic function of the prime powers p^k, k &gt;= 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A069513 extends PrependSequence {

  /** Construct the sequence. */
  public A069513() {
    super(1, new A010055().skip(), 0);
  }
}

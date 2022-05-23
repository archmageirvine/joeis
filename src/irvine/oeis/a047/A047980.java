package irvine.oeis.a047;

import irvine.oeis.InverseSequence;
import irvine.oeis.a034.A034693;

/**
 * A047980 a(n) is smallest difference d of an arithmetic progression dk+1 whose first prime occurs at the n-th position.
 *
 * @author Sean A. Irvine
 */
public class A047980 extends InverseSequence {

  /** Construct the sequence. */
  public A047980() {
    super(new A034693());
  }
}

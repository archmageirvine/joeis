package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A084997 Erroneous version of A157931.
 * @author Sean A. Irvine
 */
public class A084997 extends FilterSequence {

  /** Construct the sequence. */
  public A084997() {
    super(1, new A001358(), k -> k.isEven() || k.subtract(2).isProbablePrime());
  }
}

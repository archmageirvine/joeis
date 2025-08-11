package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A079364 Composite numbers having two composite neighbors.
 * @author Sean A. Irvine
 */
public class A079364 extends FilterSequence {

  /** Construct the sequence. */
  public A079364() {
    super(1, new A002808(), k -> !k.subtract(1).isProbablePrime() && !k.add(1).isProbablePrime());
  }
}

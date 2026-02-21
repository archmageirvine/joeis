package irvine.oeis.a083;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A083828.
 * @author Sean A. Irvine
 */
public class A083841 extends FilterSequence {

  /** Construct the sequence. */
  public A083841() {
    super(1, new A002385(), p -> p.add(2).isProbablePrime());
  }
}

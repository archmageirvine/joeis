package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a003.A003136;

/**
 * A034018.
 * @author Sean A. Irvine
 */
public class A034018 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034018() {
    super(new A003136(), new A034017());
  }
}


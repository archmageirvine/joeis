package irvine.oeis.a076;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001622;

/**
 * A076790 Merge digits of Pi and Phi (golden section) starting with 3.
 * @author Sean A. Irvine
 */
public class A076790 extends AlternatingSequence {

  /** Construct the sequence. */
  public A076790() {
    super(1, new A000796(), new A001622().skip());
  }
}

package irvine.oeis.a076;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001622;

/**
 * A076790 Interleave digits of Pi and phi-1 (golden section) starting with 3.
 * @author Sean A. Irvine
 */
public class A076790 extends InterleaveSequence {

  /** Construct the sequence. */
  public A076790() {
    super(1, new A000796(), new A001622().skip());
  }
}

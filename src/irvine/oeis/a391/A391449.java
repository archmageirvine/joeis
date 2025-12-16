package irvine.oeis.a391;

import irvine.oeis.Combiner;
import irvine.oeis.a059.A059957;
import irvine.oeis.a252.A252489;

/**
 * A391449 allocated for Ken Clements.
 * @author Sean A. Irvine
 */
public class A391449 extends Combiner {

  /** Construct the sequence. */
  public A391449() {
    super(1, new A252489(), new A059957(), SUBTRACT);
  }
}

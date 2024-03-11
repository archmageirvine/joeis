package irvine.oeis.a068;

import irvine.oeis.Combiner;

/**
 * A068723.
 * @author Sean A. Irvine
 */
public class A068740 extends Combiner {

  /** Construct the sequence. */
  public A068740() {
    super(0, new A068741(), new A068742(), DIVIDE);
  }
}

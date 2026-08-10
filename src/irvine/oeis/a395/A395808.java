package irvine.oeis.a395;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;
import irvine.oeis.a002.A002774;

/**
 * A395808 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A395808 extends Combiner {

  /** Construct the sequence. */
  public A395808() {
    super(0, new A002774(), new A000041(), (x, y) -> x.subtract(y.square()));
  }
}

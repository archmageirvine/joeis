package irvine.oeis.a062;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a048.A048050;

/**
 * A062785 a(n) = Chowla's function of n * sigma(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A062785 extends Combiner {

  /** Construct the sequence. */
  public A062785() {
    super(1, new A000203(), new A048050(), MULTIPLY);
  }
}

package irvine.oeis.a073;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;

/**
 * A073274 a(n) = A000040(n+1) - A073273(n).
 * @author Sean A. Irvine
 */
public class A073274 extends Combiner {

  /** Construct the sequence. */
  public A073274() {
    super(1, new A000040().skip(), new A073273(), SUBTRACT);
  }
}

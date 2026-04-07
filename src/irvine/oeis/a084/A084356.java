package irvine.oeis.a084;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000055;
import irvine.oeis.a023.A023359;

/**
 * A084356 a(n) = A000055(n+2) - A023359(n).
 * @author Sean A. Irvine
 */
public class A084356 extends Combiner {

  /** Construct the sequence. */
  public A084356() {
    super(0, new A000055().skip(2), new A023359(), SUBTRACT);
  }
}

package irvine.oeis.a046;

import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002485;

/**
 * A046947 |sin(n)| (or |tan(n)| or |sec(n)|) decreases monotonically to 0; also |cos(n)| (or |cosec(n)| or |cot(n)|) increases.
 * @author Sean A. Irvine
 */
public class A046947 extends SkipSequence {

  /** Construct the sequence. */
  public A046947() {
    super(0, new A002485(), 1);
  }
}

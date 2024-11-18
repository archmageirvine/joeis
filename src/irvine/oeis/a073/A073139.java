package irvine.oeis.a073;

import irvine.oeis.Combiner;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A073139 extends Combiner {

  /** Construct the sequence. */
  public A073139() {
    super(0, new A073138(), new A073137(), SUBTRACT);
  }
}

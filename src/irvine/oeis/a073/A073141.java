package irvine.oeis.a073;

import irvine.oeis.Combiner;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A073141 extends Combiner {

  /** Construct the sequence. */
  public A073141() {
    super(0, new A073138(), new A073137(), MULTIPLY);
  }
}

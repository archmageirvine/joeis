package irvine.oeis.a019;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A019566 The differences 1-1, 21-12, 321-123, ..., 10987654321-12345678910, 1110987654321-1234567891011, etc.
 * @author Sean A. Irvine
 */
public class A019566 extends Combiner {

  /** Construct the sequence. */
  public A019566() {
    super(1, new A000422(), new A007908(), SUBTRACT);
  }
}

package irvine.oeis.a074;

import irvine.oeis.Combiner;
import irvine.oeis.a019.A019645;

/**
 * A074917 Decimal expansion of (Pi+e)/2 - decimal expansion of (Pi*e)^(1/2).
 * @author Sean A. Irvine
 */
public class A074917 extends Combiner {

  /** Construct the sequence. */
  public A074917() {
    super(1, new A074916(), new A019645(), SUBTRACT);
  }
}

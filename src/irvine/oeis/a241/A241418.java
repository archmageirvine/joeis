package irvine.oeis.a241;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a099.A099054;

/**
 * A241418 First differences of Arshon's sequence, cf. A099054.
 * @author Georg Fischer
 */
public class A241418 extends DifferenceSequence {

  /** Construct the sequence. */
  public A241418() {
    super(0, new A099054());
  }

}

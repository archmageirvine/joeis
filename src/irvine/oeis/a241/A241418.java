package irvine.oeis.a241;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a099.A099054;

/**
 * A241418 First differences of Arshon&apos;s sequence, cf. A099054.
 * @author Georg Fischer
 */
public class A241418 extends DifferenceSequence implements SequenceWithOffset {

  /** Construct the sequence. */
  public A241418() {
    super(new A099054());
  }

  @Override
  public int getOffset() {
    return 0;
  }
}

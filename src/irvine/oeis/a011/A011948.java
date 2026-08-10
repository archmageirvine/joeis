package irvine.oeis.a011;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000046;
import irvine.oeis.a056.A056513;

/**
 * A011948 Number of Barlow packings with group P63mc that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011948 extends Combiner {

  /** Construct the sequence. */
  public A011948() {
    super(6, new A000046().skip(6), new A056513().skip(6), SUBTRACT);
  }
}

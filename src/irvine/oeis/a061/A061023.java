package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.a053.A053187;
import irvine.oeis.a201.A201053;

/**
 * A061023 Difference between the closest square and the closest cube to n.
 * @author Sean A. Irvine
 */
public class A061023 extends Combiner {

  /** Construct the sequence. */
  public A061023() {
    super(0, new A053187(), new A201053(), (a, b) -> a.subtract(b).abs());
  }
}


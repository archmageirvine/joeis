package irvine.oeis.a084;

import irvine.oeis.Combiner;
import irvine.oeis.a047.A047864;

/**
 * A084271 Number of labeled 3-chromatic (i.e., chromatic number = 3) graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A084271 extends Combiner {

  /** Construct the sequence. */
  public A084271() {
    super(1, new A084279(), new A047864().skip(), SUBTRACT);
  }
}

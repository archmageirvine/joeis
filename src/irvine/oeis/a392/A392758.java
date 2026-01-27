package irvine.oeis.a392;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000005;
import irvine.oeis.a257.A257993;

/**
 * A392758 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A392758 extends Combiner {

  /** Construct the sequence. */
  public A392758() {
    super(1, new A000005(), new A257993(), SUBTRACT);
  }
}

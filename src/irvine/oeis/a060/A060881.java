package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002110;

/**
 * A060881 n-th primorial (A002110) + prime(n + 1).
 * @author Sean A. Irvine
 */
public class A060881 extends Combiner {

  /** Construct the sequence. */
  public A060881() {
    super(new A002110(), new A000040(), ADD);
  }
}
